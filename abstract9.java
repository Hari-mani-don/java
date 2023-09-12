

abstract class Instrument{
	abstract void play();
	abstract void tune();
}
class Glockenspiel extends Instrument{
	
	public void play() {
		System.out.println("Glockenspiel: Playing nots on the metal bars.");
	}
	public  void tune() {	
		System.out.println("Glockenspiel: Tuning the metal bars to the correct pitch.");
	}
} 
class Violin extends Instrument{
	public void play() {
		System.out.println("Violine: Playing the Strings  with a bow or fingers.");
	}
	public  void tune() {	
		System.out.println("Violine: Tuning the Strings to the  correct pitch.");
	}

}

public class Main{
	public static void main(String args[]) {
	    Glockenspiel g = new Glockenspiel();
		Violin  v = new Violin();
		
		g.play();
		g.tune();
		
		v.play();
		v.tune();
	}
}




