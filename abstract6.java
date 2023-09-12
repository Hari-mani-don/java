

abstract class Shape3D{
	protected double radious;
	
	Shape3D(double radious){
		this.radious = radious;
	}
	abstract double calculatVolume();
	abstract double calculateSurfaceArea();
}
class Sphere extends Shape3D{
	
	Sphere(double radious){
		super(radious);
	}
	public double calculatVolume() {
		return (4.0/3.0) * Math.PI * (radious * radious * radious);
	}
	public double calculateSurfaceArea() {	
		return (4 * ((Math.PI) * (radious * radious)));
	}
} 
class Cube extends Shape3D{
 
	Cube(double side){
		super(side);
	}
	public double calculatVolume() {
		return radious * radious * radious;
	}
	public double calculateSurfaceArea() {
		return 6 *(radious * radious);
	}

}

public class Main{
	public static void main(String args[]) {
		Sphere sp = new Sphere(7.0);
		Cube c = new Cube(6.0);
	   
		System.out.println("Spher Surface Area: "+sp.calculateSurfaceArea());
		System.out.println("Spher CalculatVolume: "+sp.calculatVolume());
		System.out.println("________________________-");
		System.out.println("Spher Surface Area: "+c.calculateSurfaceArea());
		System.out.println("Spher CalculatVolume: "+c.calculatVolume());
	}
}




