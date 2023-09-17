package Hari;
import java.util.concurrent.Exchanger;

public class Main{
	public static void main(String args[]) {
		Exchanger<String> exchanger = new Exchanger<String>();
		
		Thread t1 = new Thread(()-> {
			try {
				String message = "message from Thread1";
				System.out.println("Thread 1 is sending: "+message);
				String receive = exchanger.exchange(message);
				System.out.println("Thread 1 is received: "+receive);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		});
		Thread t2 = new Thread(()-> {
			try {
				String message = "message from Thread2";
				System.out.println("Thread 2 is sending: "+message);
				String receive = exchanger.exchange(message);
				System.out.println("Thread 2 is received: "+receive);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		});
		Thread t3 = new Thread(()-> {
			try {
				String message = "message from Thread3";
				System.out.println("Thread 3 is sending: "+message);
				String receive = exchanger.exchange(message);
				System.out.println("Thread 3 is received: "+receive);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		});
		Thread t4 = new Thread(()-> {
			try {
				String message = "message from Thread4";
				System.out.println("Thread 4 is sending: "+message);
				String receive = exchanger.exchange(message);
				System.out.println("Thread 4 is received: "+receive);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		});
		t1.start();
        t2.start();
        t3.start();
        t4.start();
	}
	
}

