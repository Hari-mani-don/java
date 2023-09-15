class Resource {
	private int value=0;
	public synchronized void Increment() {
		value++;
	}
	public int getValue() {
		return value;
	}

}
class MyRunnable implements Runnable{
	Resource resource;
	MyRunnable(Resource resource){
		this.resource = resource;
	}
	public void run() {
		try {
			resource.Increment();
			System.out.println(Thread.currentThread().getName()+" -"+resource.getValue());
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
}

public class Main{
	public static void main(String args[]) {
		Resource r = new Resource();
		MyRunnable runnable = new MyRunnable(r);
		
		for(int i =0;i<5;i++) {
			Thread t1 = new Thread(runnable);
			try {
				t1.start();
			}catch(Exception e) {
				e.printStackTrace();
			}
			 
		}
		for(int i =0;i<5;i++) {
			Thread t2 = new Thread(runnable);
			try {
				t2.start();
			}catch(Exception e) {
				e.printStackTrace();
			}
			 
		}
		
	}
}
