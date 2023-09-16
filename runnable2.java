package Hari;

class SharedResource{
	private int i;
	private boolean check = false;
	public synchronized void produce(int i) {
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
	public synchronized void consumer() {
		if(!check) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		System.out.println("consumer "+ i);
		check = false;
		notify();
	}
	
}
class Producer implements Runnable{
	SharedResource resource;
	Producer(SharedResource resource){
		this.resource = resource;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<5;i++) {
			resource.produce(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Consumer implements Runnable{
	SharedResource resource;
	Consumer(SharedResource resource){
		this.resource = resource;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<5;i++) {
			resource.consumer();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class Main{
	public static void main(String args[]) {
		SharedResource  resources = new SharedResource();
		Producer produce = new Producer(resources);
		Consumer consume = new Consumer(resources);
		
		Thread t1 = new Thread(produce);
		Thread t2 = new Thread(consume);
		
		t1.start();
		t2.start();
		
	}
}



