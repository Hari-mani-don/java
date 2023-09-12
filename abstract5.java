abstract class Employee{
	private double salary;
	private String name;
	
	Employee(double salary, String name){
		this.salary = salary;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	abstract double calculatSalary();
	abstract void displayInfo();
}
class Manager extends Employee{
	
	private double bonus;

	Manager(double salary, String name, double bonus){
		super(salary,name);
		this.bonus = bonus;
	}
	public double calculatSalary() {
		return super.getSalary()+bonus;
	}
	public void displayInfo() {
		System.out.println("Manager Name: "+ super.getName());
		System.out.println("Bonus       : "+bonus);
		System.out.println("Total Salary: "+calculatSalary());
	}
	
}
class Programmer extends Employee{
 
    private double overTime;
    private double rate;
    
    Programmer(double salary, String name, double overTime, double rate){
	super(salary,name);
	this.overTime = overTime;
	this.rate = rate;
	
 }
 public double calculatSalary() {
	return super.getSalary()+(overTime * rate);
 }
  public void displayInfo() {
	System.out.println("Employee Name  : "+ super.getName());
	System.out.println("Employee Salary:"+super.getSalary());
	System.out.println("OverTime       : "+overTime);
	System.out.println("Overtime Rate  :"+rate);
	System.out.println("Total Salary   : "+calculatSalary());
  }

}

public class Main{
	public static void main(String args[]) {
		Manager m = new Manager(20000, "hari", 10000);
		Programmer  p = new Programmer(2000, "Mani", 20, 15);
		m.displayInfo();
		System.out.println("____________________________________________\n");
		p.displayInfo();
	}
}




