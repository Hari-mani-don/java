 
 public class Main{
	 public static void main(String args[]) throws InterruptedException  {
	   Thread thread = new Thread();
	   {
				for(int i=0;i<20;i+=2) {
						 try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						 System.out.println("Even : "+i);
					 }
	   };
		 
	   Thread Oddthread = new Thread(); {
				 for(int i =0; i<20;i++) {
					 if(i%2 == 0) {
						 Thread.sleep(2000);
						 System.out.println("Odd : "+i);
					 }
			 }
	   };
	    thread.start();
	    Oddthread.start();
	    Thread.sleep(10000);
	    System.out.println("Hello World!");
	     
    }
 }
