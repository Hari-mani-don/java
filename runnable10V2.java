package Hari;
import java.util.concurrent.Phaser;

public class Main{
	public static void main(String args[]) {
		Phaser phaser = new Phaser(3);
		phase ph = new phase(phaser);
		
		Thread t1 = new Thread(ph);
		Thread t2 = new Thread(ph);
		Thread t3 = new Thread(ph);
		Thread t4 = new Thread(ph);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		phaser.awaitAdvance(phaser.getPhase());
		System.out.println("Phases are finishing.");
		
	}
	
}

class phase implements Runnable{
	Phaser phaser;

	 phase(Phaser phaser){
		this.phaser = phaser;
		phaser.register();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			System.out.println(Thread.currentThread().getName()+" Theread");
			phaser.arriveAndAwaitAdvance();
			
	}
}
