class Shape{
  
  public double getArea(){
    
   return 0.0;
  }
  
  
}
class Rectangle extends Shape{
  //@Override
  double length;
  double width;
  double area;
  
  public double getArea(double length, double width){
   this.area = length * width;
   return area;
  }
}


public class Main{
  public static void main(String args[]){
    Shape shape = new Shape();
    Rectangle rectangle = new Rectangle();
    System.out.println("Shape output: "+shape.getArea());
    System.out.println("Rectangle of area: "+rectangle.getArea(20,30));
  }
}
