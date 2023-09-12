

abstract class Shape2D{
	abstract void draw();
	abstract void reSize();
}
class Rectangle extends Shape2D{
	
	public void draw() {
		System.out.println("Rectangle : Drawing a rectangle...");
	}
	public  void reSize() {	
		System.out.println("Rectangle : resizeing the rectangle...");
	}
} 
class Circle extends Shape2D{
	public void draw() {
		System.out.println("Circel: Drawing a Circle...");
	}
	public  void reSize() {	
		System.out.println("Circle: resizeing the Circle....");
	}

}

public class Main{
	public static void main(String args[]) {
	   Rectangle r = new Rectangle();
	   Circle c = new Circle();
		
		r.draw();
		r.reSize();
		
		c.draw();
		c.reSize();
	}
}




