class Resource implements Runnable{
	private int id;
	Resource(int id){
		this.id = id;
	}
	public  void run() {
		System.out.println(id);
	}
}
//class MyRunnable2 implements Runnable{
//	private int id;
//	MyRunnable2(int id){
//		this.id = id;
//	}
//	public  void run() {
//		System.out.println(id);
//	}
//}

public class Main{
	public static void main(String args[]) {
		
		
		for(int i =0;i<5;i++) {
			Runnable myRunnable = new Resource(i);
			Thread t1 = new Thread(myRunnable);
			try {
				t1.start();
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			 
		}
		for(int i =0;i<5;i++) {
			Runnable myRunnable2 = new Resource(i);
			Thread t2 = new Thread(myRunnable2);
			try {
				t2.start();
				Thread.sleep(1009);
			}catch(Exception e) {
				e.printStackTrace();
			}
			 
		}
		
	}
}
