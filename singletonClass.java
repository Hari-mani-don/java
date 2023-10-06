package Mani;

class Person {
    private static Person person;
    
    private Person() {
    	
    }
    public static Person getPerson() {
    	if(person == null) {
    		person = new Person();
    	}
    	return person;
    }


	public void  message() {
		System.out.println("hello !hari");
	}
}

public class New {
    public static void main(String[] args) {
      Person p = Person.getPerson();
      Person p1 =Person.getPerson();
      
       p.message();
    	
    }
}
