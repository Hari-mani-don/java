abstract class Vehicle{
	private String make;
	private String model; 
	private int year;
	private String fuelType;
	private double fuelEfficiency;
	
	public Vehicle(String make, String model,int year, String fuelType, double fuelEfficiency){
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuelType = fuelType;
		this.fuelEfficiency = fuelEfficiency;
	}
	public String getMake() {
		return make;
	}
    public String getModel() {
    	return model;
    }
    public String getFuelType() {
    	return fuelType;
    }
    public int getYear() {
    	return year;
    }
    public double getFuelEfficiency() {
    	return fuelEfficiency;
    }
    abstract public double CalculateFuelEfficiency();	
    abstract public double MaximumSpeed();
    abstract public double DistanceTraveled();
    
}
class Truck extends Vehicle{
	
	private double CargoCapacity;
	  Truck(String make, String model,int year, String fuelType, double fuelEfficiency, double CargoCapacity){
		  super(make, model, year, fuelType, fuelEfficiency);
		  this.CargoCapacity = CargoCapacity;
		  
	  }
	  public double getCargoCapacity() {
		  return CargoCapacity;
	  }
	  public double CalculateFuelEfficiency() {
		  return getFuelEfficiency()*(1.0/(1.0+getCargoCapacity()/1000.0));	 

	  }
	  public double MaximumSpeed() {
		  return 80.0;
	  }
	  public double DistanceTraveled() {
		  return getFuelEfficiency() * CalculateFuelEfficiency();
	  }
}
class Car extends Vehicle{
	
	private double numsets;
	Car(String make, String model,int year, String fuelType, double fuelEfficiency, double numsets){
		  super(make, model, year, fuelType, fuelEfficiency);
		  this.numsets = numsets;
	  }
	public double getNumsets() {
		return numsets;
	}
	public double CalculateFuelEfficiency() {
		return getFuelEfficiency() * (1.0/(1.0+getNumsets()/5.0));
	}
    public double MaximumSpeed() {
    	return 120.0;
    }
    public double DistanceTraveled() {
    	return CalculateFuelEfficiency() * getFuelEfficiency();
    }
    
}
class MotorCycle extends Vehicle{
	double engineDisplacement;
	MotorCycle(String make, String model,int year, String fuelType, double fuelEfficiency){
		  super(make, model, year, fuelType, fuelEfficiency);
		 // this.engineDisplacement = engineDisplacement;
		  
	  }
	public double getEngineDisplacement() {
		return engineDisplacement;
	}
	public double CalculateFuelEfficiency() {
		return getFuelEfficiency() * (1.0/(1.0 + getEngineDisplacement()/1000.0));
	}
    public double MaximumSpeed() {
    	return 80.0;
    }
    public double DistanceTraveled() {
    	return CalculateFuelEfficiency() * getFuelEfficiency();
    }
    
}

class Main{
	public static void main(String args[]) {
		Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);
		Car car = new Car("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);
		MotorCycle motorcycle = new MotorCycle("Massimo Motor", "Warrior200", 2018, "GASOLINE", 2.1);
		
		System.out.println("Truck Model: " + truck.getModel());
		System.out.println("Fuel Efficiency: " + truck.CalculateFuelEfficiency() + " mpg");
		System.out.println("Distance Traveled: " + truck.DistanceTraveled() + " miles");
		System.out.println("Max Speed: " + truck.MaximumSpeed() + " mph\n");

		System.out.println("Car Model: " + car.getModel());
		System.out.println("Fuel Efficiency: " + car.CalculateFuelEfficiency() + " mpg");
		System.out.println("Distance Traveled: " + car.DistanceTraveled() + " miles");
		System.out.println("Max Speed: " + car.MaximumSpeed()  + " mph\n");

		System.out.println("Motorcycle Model: " + motorcycle.getModel());
		System.out.println("Fuel Efficiency: " + motorcycle.CalculateFuelEfficiency() + " mpg");
		System.out.println("Distance Traveled: " + motorcycle.DistanceTraveled() + " miles");
		System.out.println("Max Speed: " + motorcycle.MaximumSpeed()  + " mph");
		
	}
}
