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
	
	private double side;
	private double base;
	private double height;
	private double breath;
	Triangle(double side, double base, double breath, double height){
		this.side = side;
		this.base = base;
		this.height = height;
		this.breath = breath;
	}
	public double calculateArea() {
		return (breath * height) /2;
	}
	public double calculatePerimeter() {
		return side + side + base;
	}
}

public class Main {
	public static void main(String args[]) {
		Circle circle = new Circle(20);
		Triangle triangle = new Triangle(30, 40, 35, 20);
		System.out.println("Circle Area of : "+circle.calculateArea());
		System.out.println("Circle Perimeter of : "+circle.calculatePerimeter()+"\n");
		System.out.println("Triangle Area of :"+triangle.calculateArea());
		System.out.println("Triangle Perimeter of :"+triangle.calculatePerimeter());
	}
}
