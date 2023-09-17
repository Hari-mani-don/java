package Hari;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Main{
	public static void main(String args[]) {
		ConcurrentLinkedDeque<Integer> queue = new ConcurrentLinkedDeque<Integer>();
		Runnable produce = () ->{
             for(int i=0;i<5;i++) {
            	 queue.offer(i);
            	 System.out.println("produce : " +i);
//            	 try {
//                	 Thread.sleep(1000);
//                 }catch(InterruptedException e) {
//                	 e.printStackTrace();
//                 }
             }
		};
		Runnable consumer = new Runnable() {
            
			@Override
			public void run() {
				while(true) {
				Integer value = queue.poll();
				if(value != null) {
				System.out.println("Consumer : " +value);
				}
//	            try {
//	           	 Thread.sleep(1000);
//	            }catch(InterruptedException e) {
//	           	 e.printStackTrace();
//	            }
			  }
			}
		};
		
		Thread t1 = new Thread(produce);
		Thread t2 = new Thread (consumer);
		
		t1.start();
		t2.start();
	}
	
}
