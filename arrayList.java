import java.util.*;
public class Main{
	public static void main(String args[]) {
		int a[] = {1,2,3,4,5};
		ArrayList<Integer> b = new ArrayList<>();
		b.add(5);
		b.add(6);
		b.set(1,10);
		a[2]=10;
		System.out.println("ouput: "+Arrays.toString(a));
		System.out.println("ouput: "+b);
		System.out.println("new:"+ b.contains(10));
		System.out.println("new:"+ b.indexOf(10));
	}
}
