

abstract class GeomentricShape{
	
	abstract double area();
	abstract double perimeter();
}
class Triangle extends GeomentricShape{
	
	private double side1;
	private double side2;
	private double side3;
	Triangle(double side1, double side2, double side3){
		this.side3 = side3;
		this.side1= side1;
		this.side2 = side2;
	}
	public double area() {
			double s  =	(side1 + side2 + side3) /2;
			return Math.sqrt(s *(s - side1) * (s - side2) * (s - side3));
	}
	public  double perimeter() {	
		return (side1 + side2 + side3);
	}
} 
class Squre extends  GeomentricShape{
	private double side;
	Squre(double side){
		this.side = side;
	}
	public double area() {
		return (side * side);
	}
	public  double perimeter() {	
		return 4*(side);
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




