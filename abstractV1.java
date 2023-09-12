abstract class Shape{
	abstract double calculateArea();
	abstract double calculatePerimeter();
}
class Circle extends Shape{
	private double radious;
	
	Circle(double radious){
		this.radious = radious;
	}
	public double getRadious() {
		return radious;
	}
	public double calculateArea(){
		return Math.PI * radious * radious;
	}
	public double calculatePerimeter() {
		return  2 * Math.PI * radious;
	}
	
}
class Triangle extends Shape{
	
	private double side1;
	private double side2;
	private double side3;
	
	Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double calculateArea() {
		double s =  (side1+side2+side3) /2;
		return (s * (s - side1) * (s - side2) * (s - side3));
		
	}
	public double calculatePerimeter() {
		return side1 + side2 + side3;
	}
}

public class Main {
	public static void main(String args[]) {
		Circle circle = new Circle(4);
		Triangle triangle = new Triangle(3,4,5);
		System.out.println("Circle Area of : "+circle.calculateArea());
		System.out.println("Circle Perimeter of : "+circle.calculatePerimeter()+"\n");
		System.out.println("Triangle Area of :"+triangle.calculateArea());
		System.out.println("Triangle Perimeter of :"+triangle.calculatePerimeter());
	}
}
