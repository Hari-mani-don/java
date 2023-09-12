 class hari extends Thread{
	public void run() {
		System.out.println("Hello world!");
	}
}
 
 public class Main{
	 public static void main(String args[]) {
	     hari n = new hari();
		 
		 n.start();
	     
    }
 }
