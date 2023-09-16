package Hari;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class Main{
	public static void main(String args[]) {
		ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
		ExecutorService ex = Executors.newFixedThreadPool(4);
		for(int i =0;i<4;i++) {
			ex.submit(new AccessTask(concurrentHashMap, i));
		}
		ex.shutdown();
	}
	
}
class AccessTask implements Runnable{
	int id;
	ConcurrentHashMap<String, Integer> map;
	
	AccessTask(ConcurrentHashMap<String, Integer> map, int id){
		this.map = map;
		this.id = id;
	}
	
    
@Override
public void run() {
	// TODO Auto-generated method stub
	for(int i =0;i<3;i++) {
	  map.put("key"+id+"-"+i,i);
	  int value = map.get("key"+id+"-"+i);
      System.out.println("Thread " + id + " retrieved Key" + id + "-" + i + " with value: " + value);
	}
}
}
