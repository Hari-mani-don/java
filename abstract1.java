abstract class Animal{
	abstract void sound();
}
class Lion extends Animal{
	public void sound() {
		System.out.println("This a linon sound");
	}
}
class Tiger extends Animal{
	public void sound() {
		System.out.println("This is a Tiger sound");
	}
}

public class Main{
	public static void main(String argsp[]) {
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		lion.sound(); //output lion roars
		tiger.sound(); //output tiger growls
	}
	
}
