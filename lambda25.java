package Hari;

import java.util.function.Function;


public class Main{
	public static void main(String args[]) {
		
		int n =747;
	   Function<Integer, String> convertString = num -> num.toBinaryString(num);
	   String binary = convertString.apply(n);
	   System.out.println("Binary representaion of :"+binary);
		
	}
	
}
