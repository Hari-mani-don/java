package Hari;
import java.util.concurrent.locks.StampedLock;
public class Main{
	public static void main(String args[]) {
		BankAccount bank = new BankAccount();
		Runnable deposit = () ->{
			for(int i=0;i<1000;i++) {
				bank.deposit(10.0);
			}
		};
		Runnable withdraw = () ->{
			for(int i=0;i<1000;i++) {
				bank.withdraw(5.0);
			}
		};
		
		Thread t1 = new Thread(deposit);
		Thread t2 = new Thread(withdraw);
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Final Balance: "+bank.getBalance());
	}
}
class BankAccount{
	StampedLock lock = new StampedLock();
	private double balance = 0.0;
	
	public double getBalance(){
		long stamp = lock.tryOptimisticRead();
		 double currentBalace = balance;
	    if(!lock.validate(stamp)) {
	    	try{
	    		currentBalace = balance;
	    	}finally {
	    		lock.unlockRead(stamp);
	    	}
	    	  
	    }
	    return currentBalace;
	}
	public void deposit(double deposit) {
		
		long stamp=lock.writeLock();
		try {
			balance += deposit;
		}finally {
			lock.unlockWrite(stamp);
		}
		
	}
	public boolean withdraw(double amount) {
		long stamp = lock.writeLock();
		try {
			if(balance >=amount) {
				balance-=amount;
				return true;
			}else {
				return false;
			}
		}finally {
			lock.unlockWrite(stamp);
		}
	}
}
