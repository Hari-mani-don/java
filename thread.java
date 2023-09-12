class Db {
	synchronized public void run() {
		for(int i =0;i<5;i++) {
	       System.out.println("hari");
		}
	}
}

class Bd {
	public void run() {
		for(int i =0;i<5;i++) {
	      System.out.println("Mani");
		}
	}
}
 

public class Main{
	 public static void main(String args[])   {
      Db d = new Db();
	  Bd b = new Bd();
	    
	   Thread h = new Thread() {
		   public void run() {
			   d.run();
		   }
	   };
	   
	   Thread f = new Thread() {
		   public void run() {
			   b.run();
		   }
	   };
	   
	   h.start();
	   f.start();
	  f.setPriority(10);;
	   
    }
	 
 }
