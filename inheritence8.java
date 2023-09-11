class Shape{

	public double getPerimeter(){
		return 0.0;
	}
	public double getArea() {
		return 0.0;
	}
	
}
class Circle extends Shape{
	private double radious;
	Circle( double radious){
		this.radious = radious;
	}
	public double getPerimeter(){
		return 2*Math.PI * radious;
	}
	public double getArea() {
		return Math.PI * radious * radious;
	}
}

class Main{
	public static void main(String args[]) {
		double r = 5;
		Circle c = new Circle(r);

		System.out.println("radious of Circle: "+ r);
		System.out.println("Perimeter of Circle : "+ c.getPerimeter());
		System.out.println("Area of Circle: "+ c.getArea());
		r = 9;
		Circle c2 = new Circle(r);
		System.out.println("radious of circle: "+ r);
		System.out.println("Perimeter of Circle : "+ c2.getPerimeter());
		System.out.println("Area of Circle: "+ c2.getArea());
		
		
		
	}
}
