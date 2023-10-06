package Mani;

import java.util.ArrayList;
import java.util.List;

public class New extends Object{
	 public static void main(String[] args) {
		 List<String> list = new ArrayList<String>();
		 list.add("hari");
		 list.add("harini");
		 hari h1 = new hari("mani", list);
		 hari h2 = new hari(h1.getName(), h1.getList());
		 h2.getList().add("Vrp");
		 System.out.println(h2);
		 System.out.println(h1);
  }
	
}

class hari{
	private String name;
	List<String> list;
	
	hari(String name, List<String> list){
		this.name = name;
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "hari [name=" + name + ", list=" + list + "]";
	}
	
	
}
