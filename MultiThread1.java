

class Count extends Thread{
	 public static int cou=0;
    public void run() {
     
    	for(int i=0; i<500;i++) {
    		cou++;
    		
    	}
    }
	public int getCou() {
		return cou;
	}
	public void setCou(int count) {
		this.cou = count;
	}
}
public class Main{
	static final int MULTI_THREAD = 2;
	public static void main(String args[]) {
		Thread n[] =  new Thread[MULTI_THREAD];
		
		for(int i =0; i<MULTI_THREAD; i++) {
			n[i] = new Thread(new Count());
			n[i].start();
		}
		
		for(Thread thread: n){
			try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		Count a = new Count();
		System.out.println("Final Count: "+a.getCou());
	}
}
