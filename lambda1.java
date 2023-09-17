package Hari;
public class Main{
	public static void main(String args[]) {
	
		Sum sum =  (a,b) -> a+b;
	    int result = sum.add(20, 30);
	    System.out.println("Sum of  "+ result);
        System.out.println("Sum of  "+ sum.add(50, -20));
		
		
	}
}
interface Sum{
     int  add(int a, int b);
}
