class MyRunnable implements Runnable{
	public void run() {
		for(int i =0;i<5;i++) {
			try {
		    System.out.println(i);
		    Thread.sleep(1009);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class MyRunnable2 implements Runnable{
	public void run() {
		for(int i =0;i<5;i++) {
			try {
		    System.out.println(i);
		    Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Main{
	public static void main(String args[]) {
		Runnable myRunnable = new MyRunnable();
		Runnable myRunnable2 = new MyRunnable2();
		
		Thread t1 = new Thread(myRunnable);
	    Thread t2 = new Thread(myRunnable2);
	    
	    t1.start();
	    t2.start();
	}
}
