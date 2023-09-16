package Hari;
import java.util.concurrent.CyclicBarrier;

class Resources {
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
	
}


public class Main{
	public static void main(String args[]) {
		 CyclicBarrier cyclicBarrier = new CyclicBarrier(1);
		Resources resource = new Resources(cyclicBarrier);
		
		Runnable r = new Runnable() {

			@Override
			public void run() {
				
				try {
					resource.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		Thread t1 = new Thread(r);
		//Thread t2 = new Thread(r);
//		Thread t3 = new Thread(r);
//		Thread t4 = new Thread(r);
		t1.start();
		//t2.start();
//		t3.start();
//		t4.start();
		
		
}
}






