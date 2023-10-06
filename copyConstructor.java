package Mani;

public class New extends Object{
	 public static void main(String[] args) {
		
		 hari h = new hari("mani", 20);
		 hari h2 = new hari(h);
		 h2.setName("ma");
		 System.out.println(h2);
  }
	
}

class hari{
	private String name;
	private int age;
	
	hari(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public hari(hari copy) {
		this.name = copy.name;
		this.age = copy.age;
	}
	public String toString() {
		return "name: "+name + "\nage: "+ age;
		
	}

}
