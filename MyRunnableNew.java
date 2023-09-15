package awtDemo;

class Resource {
	private int id;
	private boolean value =false; 
	public synchronized void produce(int id) {
		if(value) {
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		this.id = id;
		System.out.println("producer "+id);
		value =true;
		notify();
	}
	public synchronized void consume() {
		if(!value) {
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consume "+id);
		value =false;
		notify();
//		return id;
	}
}
class produce implements Runnable{
    Resource resource;
	produce(Resource resource){
		this.resource = resource;
	}
	public void run() {
	   for(int i =0;i<5;i++) {
		   resource.produce(i);
		   try {
		   Thread.sleep(1000);
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
	   }
	}
	
}
class Consumer implements Runnable{
    Resource resource;
	Consumer(Resource resource){
		this.resource = resource;
	}
	public void run() {
	   for(int i =0;i<5;i++) {
		   resource.consume();
		   try {
		   Thread.sleep(1000);
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
	   }
	}
	
}
public class Main {
  public static void main(String args[]) {
	  Resource resource = new Resource();
	  
	  Thread t1 = new Thread(new produce(resource));
	  Thread t2 = new Thread(new Consumer(resource));
	  t1.start();
	  t2.start();
  }
}
