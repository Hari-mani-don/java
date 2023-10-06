package Mani;

public class New extends Object{
	 public static void main(String[] args) {
		
		 hari h = new hari("mani", 20);
		 hari h2 = h.copy(h);
		 h2.setName("m");
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

	
	public hari copy(hari object) {
		return new hari(object.getName(), object.getAge());
		
	}
	public String toString() {
		return "name: "+name + "\nage: "+ age;
		
	}

}
