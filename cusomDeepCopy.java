package Mani;

import java.util.ArrayList;
import java.util.List;


class Person {

	private List<Integer> list;
	private int num;
	
	public Person(int num, List<Integer> list) {
		this.list = new ArrayList<Integer>(list);
		this.num = num;
	}
	
	public List<Integer> getList() {
		return new ArrayList<Integer>(list);
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
   
	
}

public class New {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<Integer>();
       list.add(2);
       list.add(3);
       Person p = new Person(4, list);
       Person person = new Person(p.getNum(),p.getList());
       
       person.getList().add(0, 7);
       System.out.println(p.getList());
       System.out.println(person.getList());
    }

	
}
