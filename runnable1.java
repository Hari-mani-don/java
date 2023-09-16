package Hari;

public class Main {

	public static void main(String[] args) {
		Resource resource = new Resource();
		Runnable produce = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<5;i++) {
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
		Runnable consumer = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<5;i++) {
					resource.consumer();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		};
      
		Thread t1 = new Thread(produce);
		Thread t2 = new Thread(consumer);
		t1.start();
		t2.start();
	}

}
class Resource implements Runnable{
	private int i;
	private boolean check = false;
	
	public synchronized void  produce(int i){
		if(check) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.i = i;
		System.out.println("produce "+i);
		check = true;
		notify();
	}
	public synchronized void  consumer(){
		if(!check) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("consumer"+i);
		check = false;
		notify();
	}

}
