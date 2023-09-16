package Hari;
import java.util.*;
import java.util.concurrent.CountDownLatch;

public class Main{
	CountDownLatch Count = new CountDownLatch(3);
	public static void main(String args[]) {
		CountDownLatch Count = new CountDownLatch(3);
		Thread thread[] = new Thread[3];
		//Start st=new Start(Count); or
		for(int i =0; i<3;i++) {
		     thread[i] = new Thread(new Start(Count)); //or
		     thread[i].start();
		}
		
		try {
			Count.await();
			System.out.println(" Finish ");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}

class Start implements Runnable{
	
	CountDownLatch count;
	Start(CountDownLatch count) {
		this.count = count;
	}
     public void countStart() {
	try {
		Thread.sleep(1000);
	}catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println(" Thrad ->"+Thread.currentThread().getName());
	count.countDown();
   }

@Override
public void run() {
	// TODO Auto-generated method stub
	countStart();
}
}
