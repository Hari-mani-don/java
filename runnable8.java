package Hari;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main{
	public static void main(String args[]) {
		List <Integer> shareList = new ArrayList<>();
		ReadWriteLock readWrite = new ReentrantReadWriteLock();
		Start st = new Start(readWrite, shareList);
		Thread t1 = new Thread(st);
		t1.start();
	}
	
}
class Start implements Runnable{
	ReadWriteLock readWrite;
	List shareList;
	
	Start(ReadWriteLock readWrite, List shareList){
		this.readWrite = readWrite;
		this.shareList = shareList;
	}
	
    public void write(int i) {
    	
    	readWrite.writeLock().lock();
    	try {
    		shareList.add(i);
    		System.out.println("writer added: "+i);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		readWrite.writeLock().unlock();
    	}// sleepRandomMilliose(100);
     }

    public void read1() {
    	readWrite.readLock().lock();;
    	try {
    		System.out.println("Reader: "+shareList);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		readWrite.readLock().unlock();
    	} //sleepRandomMilliose(100);
     }

//    public void sleepRandomMilliose(int Millios) {
//    	try {
//    	Thread.sleep((long) (Math.random())* Millios);
//    	
//    }catch(InterruptedException e) {
//    	Thread.currentThread().interrupt();
//     }
//    }
@Override
public void run() {
	// TODO Auto-generated method stub
	for(int i =0;i<5;i++) {
	
	try {
		write(i);
		Thread.sleep(1000);
		read1();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	
	}
}
}
