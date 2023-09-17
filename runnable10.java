package Hari;
import java.util.concurrent.Phaser;

public class Main{
	public static void main(String args[]) {
		Phaser phaser = new Phaser(3);
		phase ph = new phase(phaser);
		for(int i=0;i<3;i++) {
			Thread thread = new Thread(ph);
			thread.start();
		}
		
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
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+" Theread");
			phaser.arriveAndAwaitAdvance();
		}
	}
}
