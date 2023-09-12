

abstract class GeomentricShape{
	protected double side;
	
	GeomentricShape(double side){
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	abstract double area();
	abstract double perimeter();
}
class Triangle extends GeomentricShape{
	
	private double base;
	private double height;
	Triangle(double side, double base, double height){
		super(side);
		this.base = base;
		this.height = height;
	}
	public double area() {
		return (base * height) / 2;
	}
	public  double perimeter() {	
		return (side + side + base);
	}
} 
class Squre extends  GeomentricShape{
	
	Squre(double side){
		super(side);
	}
	public double area() {
		return 4*(side);
	}
	public  double perimeter() {	
		return (side * side);
	}

}

public class Main{
	public static void main(String args[]) {
	  Triangle t = new Triangle(4,5,6);
	  Squre s = new Squre(6);
	  
	  System.out.println("Triangle Area: " +t.area());
	  System.out.println("Triangle perimeter: " +t.perimeter());
	  System.out.println("Squre Area: " +s.area());
	  System.out.println("Squre perimeter: " +s.perimeter());
	}
}




