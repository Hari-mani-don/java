package Hari;
import java.util.concurrent.CyclicBarrier;

class Resources implements Runnable {
	CyclicBarrier cyclicBarrier;
	Resources(CyclicBarrier cyclicBarrier ){
	     this.cyclicBarrier	= cyclicBarrier;
	}
	public void produce() throws InterruptedException {
		
		try {
			System.out.println("start "+Thread.currentThread().getName());
			cyclicBarrier.await();
			System.out.println("end "+ Thread.currentThread().getName());
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void run() {
		
		try {
			produce();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


public class Main{
	public static void main(String args[]) {
		 CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
		Resources resource = new Resources(cyclicBarrier);
		
		
		Thread t1 = new Thread(resource);
		Thread t2 = new Thread(resource);
//		Thread t3 = new Thread(resource);
//		Thread t4 = new Thread(resource);
		t1.start();
		t2.start();
//		t3.start();
//		t4.start();
		
		
}
}






