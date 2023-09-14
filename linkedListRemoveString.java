import java.util.*;
public class Main{
	public static void main(String args[]) {
		LinkedList<String> li = new LinkedList<>();
		li.add("123");
		li.add("456");
		li.add("789");
		li.remove("789");
		li.remove(1);
	    System.out.println(li);
		
	}
}
