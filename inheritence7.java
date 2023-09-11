class Person{
	private String firstName;
	private String LastName;
	Person(String firstName, String LastName){
		this.firstName = firstName;
		this.LastName = LastName;
	}
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
}
class Employee extends Person{
	private int EmployeeId;
	Employee(String firstName, String LastName, int emp){
		super(firstName, LastName);
		this.EmployeeId = emp;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public String  getLastName() {
		return super.getLastName();
		
	}
}

class Main{
	public static void main(String args[]) {
		Employee em = new Employee("Harimani", "Done:)", 21154);
		Employee em2 = new Employee("harisha", "Mani", 16680);
		System.out.println(em2.getFirstName()+ " "+ em2.getLastName()+" "+ em2.getEmployeeId());
		System.out.println(em.getFirstName()+ " "+ em.getLastName()+" "+ em.getEmployeeId());
		
		
		
	}
}
