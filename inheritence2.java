class Vehicle{
  public void drive(){
    System.out.println("Repairing a Vehicle");
  }
}
class Car extends Vehicle{
  //@Override
  public void drive(){
    System.out.println("Repairing a Car");
  }
}


public class Main{
  public static void main(String args[]){
    Vehicle vehicle = new Vehicle();
    vehicle.drive();
    Car car = new Car();
    car.drive();
  }
}
