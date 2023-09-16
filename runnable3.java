package Hari;
import java.util.concurrent.locks.*;
import java.util.concurrent.locks.ReentrantLock;
class Resources {
	private Lock lock = new ReentrantLock();
	private int  i;
	public void produce(int i) {
		lock.lock();
		try {
			System.out.println("produce"+ i);
		}finally {
			lock.unlock();
		}
		this.i = i;
	}
	public void consume() {
		lock.lock();
		try {
			System.out.println("Consume"+ i);
		}finally {
			lock.unlock();
		}
		
	}
}

class Produce implements Runnable {
	
	Resources resources;
	Produce(Resources resources){
		this.resources = resources;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<5;i++) {
			resources.produce(i);
		}
	}
}


class Consumer implements Runnable {
	
	Resources resources;
	Consumer(Resources resources){
		this.resources = resources;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<5;i++) {
			resources.consume();
		}
	}
}

public class Main{
	public static void main(String args[]) {
		Resources resource = new Resources();
		
		Thread t1 = new Thread(new Produce(resource));

		Thread t2 = new Thread(new Consumer(resource));
		
		t1.start();
		t2.start();
}
}






