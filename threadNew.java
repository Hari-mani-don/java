package Mani;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Hari {
    public static void main(String[] args) {
       Lock lock = new ReentrantLock();
       
       Thread thread1 = new Thread(() ->{
    	  
    	   for(int i=0;i<5;i++) {
    	   lock.lock();
    	   try {
    		   System.out.println("produced"+i);
    		   Thread.sleep(1000);
    	   }catch(Exception e){
    		   e.printStackTrace();
    	   }finally {
    		   lock.unlock();
    	   }  
    	   }
       });

       Thread thread2 = new Thread(() ->{
     	 
     	  for(int i=0;i<5;i++) {
    	   lock.lock();
    	   try {
    		   System.out.println("Consumed"+i);
    		   Thread.sleep(1000);
    	   }catch(Exception e){
    		   e.printStackTrace();
    	   }finally {
    		   lock.unlock();
    	   }
     	  }
       });

        thread1.start();
        thread2.start();
    }
}
