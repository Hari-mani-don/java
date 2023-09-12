

abstract class Person{
	abstract void eat();
	abstract void exercise();
}
class Athelete extends Person{
	
	public void eat() {
		System.out.println("Athelet: Include foods full of calcium, iron, pottasium, fiber.");
	}
	public  void exercise() {	
		System.out.println("Athelet: Training allows the body to gradually build up strength and endurance improve skills"
				+ "and  build motivation, ambition and confidence");
	}
} 
class LazyPerson extends Person{
	public void eat() {
		System.out.println("Couch potato: Eating  while watching  Tv also prolongs the time period that we're eating");
	}
	public  void exercise() {	
		System.out.println("Couch potato: Rarely exercising  or being physically active");
	}

}

public class Main{
	public static void main(String args[]) {
		Athelete a = new Athelete();
		LazyPerson l = new LazyPerson();
		
		a.eat();
		a.exercise();
	   
		l.eat();
		l.exercise();
	}
}




