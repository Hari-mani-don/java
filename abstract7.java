

abstract class Vehicle{
	abstract void StartEngine();
	abstract void StopEngine();
}
class Car extends Vehicle{
	
	public void StartEngine() {
		System.out.println("Starting From Car Engine.....");
	}
	public  void StopEngine() {	
		System.out.println("Stoping From Car Engine.....");
	}
} 
class MotorCycle extends Vehicle{
	public void StartEngine() {
		System.out.println("Starting From MotorCycle Engine.....");
	}
	public  void StopEngine() {	
		System.out.println("Stoping From MotorCycle Engine.....");
	}

}

public class Main{
	public static void main(String args[]) {
		Car c = new Car();
		MotorCycle m = new MotorCycle();
		
		c.StartEngine();
		c.StopEngine();
		m.StartEngine();
		m.StopEngine();
	}
}




