import java.util.*;
public class Main{
	public static void main(String args[]) {
		LinkedList<String> li = new LinkedList<>();
		li.add("hari");
		li.add("mani");
		li.add("done");
		li.set(1, "selva");
		for(int i =0; i<li.size();i++) {
			System.out.print(li.get(i)+ " ");
		}
	    System.out.println();
		for(String i :li)
			 System.out.print(i+ " ");
	}
}
