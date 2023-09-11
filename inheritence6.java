class Animal{
	public void move(){
		System.out.println("this is a Animal world!");
	}
}
class Cheetah extends Animal{
	
	public void move() {
		System.out.println("This is a cheetah world!");
	}
}

class Main{
	public static void main(String args[]) {
		Animal an = new Animal();
		Cheetah ch  = new Cheetah();
		an.move();
		ch.move();
	}
}
