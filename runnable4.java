package Hari;
import java.util.concurrent.locks.*;
import java.util.concurrent.locks.ReentrantLock;
class Resources {
	private Lock lock = new ReentrantLock();
	private int  i;
	public void produce(int i) {
		lock.lock();
		try {
			this.i = i;
			System.out.println("produce"+ i);
		}finally {
			lock.unlock();
		}
		
	}
	public void consume() {
		lock.lock();
		try {
			System.out.println("Consume"+ i);
		}finally {
			lock.unlock();
		}
		
	}
}


public class Main{
	public static void main(String args[]) {
		Resources resource = new Resources();
		
		Runnable produce = new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				for(int i =1;i<=5;i++) {
					resource.produce(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};

		Runnable Consumer = new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				for(int i =0;i<5;i++) {
					resource.consume();
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread t1 = new Thread(produce);

		Thread t2 = new Thread(Consumer);
		
		t1.start();
		t2.start();
}
}






