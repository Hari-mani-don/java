class Employee{
 private double salary;
  
  Employee(double salary) {
    this.salary = salary;
  } 
  public void work(){
    System.out.println("working as an Employee ");
  }
  
  public double getSalary(){
    return salary;
  }
  
}
class HRManager extends Employee{
  
  HRManager(double salary){
    super(salary);
  }
   public void work(){
     System.out.println("Managinge Employees");
   }
   public void addEmployee(){
     System.out.println("Add new employee");
   }
  
}

public class Main{
  public static void main(String args[]){
	  Employee em = new Employee(2000);
     HRManager hr = new HRManager(50000);
    em.work();
    System.out.println("Employee Salary: "+ em.getSalary());
    hr.work();
    System.out.println("Manager Salary: "+hr.getSalary());
    hr.addEmployee();
    
  }
}
