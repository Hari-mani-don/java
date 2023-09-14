import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		System.out.print("Enter the element: ");
		for(int i =0; i<3;i++) {
			list.add(sc.nextInt());
		}
		System.out.print("before Linked List: ");
		for(Integer l:list)
			   System.out.print(l+" ");
	  Object a [] = list.toArray();
	  System.out.print("\nAfter Linked List: ");
	  for(Object b:a)
		   System.out.print(b+" ");
		
		
	}
}
