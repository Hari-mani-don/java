import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<>();
		System.out.print("Enter the element: ");
		for(int i =0; i<3;i++) {
			list.add(sc.next());
		}
	  
	  System.out.print("\nIndex of Linked List: "+list.size()+ "with"+list);
	  
		
	}
}
