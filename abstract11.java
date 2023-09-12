

abstract class Bird{
	abstract void fly();
	abstract void makeSound();
}
class Eagle extends Bird{
	
	public void fly() {
		System.out.println("Eagle: Flying high in the sky.");
	}
	public  void makeSound() {	
		System.out.println("Eagle: scretch! scretch!");
	}
} 
class Hawk extends Bird{
	public void fly() {
		System.out.println("Hawk: Soaring throw the air.");
	}
	public  void makeSound() {	
		System.out.println("Hawk: Caw! Caw!");
	}

}

public class Main{
	public static void main(String args[]) {
	   Eagle e = new Eagle();
		Hawk h = new Hawk();
		
		e.fly();
		e.makeSound();
		
		h.fly();
		h.makeSound();
	}
}




