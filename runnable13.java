package Hari;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;

public class Main{
	public static void main(String args[]) throws InterruptedException, ExecutionException {
		ScheduledExecutorService shedule = Executors.newScheduledThreadPool(5);
		
		shedule.schedule(new Mycallable(), 5, TimeUnit.SECONDS);
		shedule.scheduleAtFixedRate(new Mycallable(), 0,5, TimeUnit.SECONDS);
		
		 try {
		      Thread.sleep(15000);
		    } catch (InterruptedException e) {
		      e.printStackTrace();
		    }
		shedule.shutdown();
	}
	
}
class Mycallable implements Runnable {	

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task executed at : "+new Date());
	}
	
}

