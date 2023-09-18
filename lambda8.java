package Hari;
import java.util.stream.IntStream;
public class Main{
	public static void main(String args[]) {
		int number =5;
		long fact = IntStream.range(1, number+1)
		      .reduce(1,(a,b) -> a * b);
		     
		System.out.println("Factorial of: "+fact);
		
	}
}
