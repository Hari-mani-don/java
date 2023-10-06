package Mani;

class Person implements Cloneable {
	private int age;
	private String name;
	Person(int age, String name){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException {
	     return super.clone();
	}
	
}

public class New {
    public static void main(String[] args) throws CloneNotSupportedException {
     
    	Person p1 = new Person(20, "hari");
    	Person p2 = (Person) p1.clone();
        p1.setName("mani");
    	System.out.println(p1);
    	System.out.println(p2);
    }
}
