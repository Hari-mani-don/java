import java.util.*;

public class AnonymousInterface {

	public static void main(String[] args) throws CloneNotSupportedException {
	 
	  Department dept = new Department(1, "math");
	  Student s1 = new Student(2, "hari", dept);
	  Student s2 = (Student)s1.clone();
	  dept.deptName = " phisics";
	  s1.stdName = "vvv";
	  s1.display();
	  s2.display();

	}

}

class Department extends Object implements Cloneable{
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
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Student implements Cloneable{
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
	public Object clone() throws CloneNotSupportedException{
		Student s  = (Student)super.clone();
		s.dept = (Department)s.dept.clone();
		
		
		return s;
	}
}




