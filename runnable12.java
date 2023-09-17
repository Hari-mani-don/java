package Hari;
import java.util.concurrent.*;

public class Main{
	public static void main(String args[]) throws InterruptedException, ExecutionException {
		ExecutorService execute = Executors.newSingleThreadExecutor();
		
		Callable<Integer> call = new Mycallable();
		
		Future<Integer> future = execute.submit(call);
		System.out.println("Start execution....");
		
		Integer value = future.get();
		System.out.println("Got the Result: "+ value);
		
		execute.shutdown();
	}
	
}
class Mycallable implements Callable{

	@Override
	public Integer call() throws Exception {
		System.out.println("task start");
		Thread.sleep(1000);
		System.out.println("Task Complete");
		return 10;
	}
	
}

