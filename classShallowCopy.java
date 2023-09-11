public class AnonymousInterface {

	public static void main(String[] args) {
	  Department dept = new Department(1, "math");
	  Student s1 = new Student(2, "hari", dept);
	  Student s2 = s1;
	  dept.deptName = " phisics";
	  s1.display();
	  s2.display();

	}

}

class Department{
	int deptid;
	String deptName;
	Department(int deptid, String deptName){
		this.deptid = deptid;
		this.deptName = deptName;
	}
	public void display(){
		System.out.println("Depart Id: "+ deptid);
		System.out.println("Depart Name: "+deptName);
	}
}

class Student{
	int stuid;
	String stdName;
	Department dept;
	Student(int stuid, String stdName, Department d){
		this.stuid = stuid;
		this.stdName= stdName;
		this.dept = d;
	}
	public void display() {
		System.out.println("Student id: "+ stuid);
		System.out.println("Student Name: "+ stdName);
		dept.display();
	}
}




