abstract class Animal{
	abstract void eat();
	abstract void sleep();
}
class Lion extends Animal{
	public void eat() {
		System.out.println("lion eats something");
	}
	public void sleep() {
		System.out.println("Lion most time sleeep");
	}
}
class Tiger extends Animal{
	public void eat() {
		System.out.println("tiger eats something");
	}
	public void sleep() {
		System.out.println("tiger most time sleeep");
	}
}
class Deer extends Animal{
	public void eat() {
		System.out.println("Deer eats something");
	}
	public void sleep() {
		System.out.println("Deer most time sleeep");
	}
}

public class Main {
	public static void main(String args[]) {
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		Deer deer = new Deer();
		
		lion.eat();
		lion.sleep();
		tiger.eat();
		tiger.sleep();
		deer.eat();
		deer.sleep();
	}
}
