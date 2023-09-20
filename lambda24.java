package Hari;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.LongStream;


public class Main{
	public static void main(String args[]) {
		
	
		int n=36;
		n=176;
	   System.out.println("Largest Prime Factor of :"+ findLargest(n));
	}
	public static long findLargest(long n) {
		for(long i = (long) Math.sqrt(n);i>=2;i--) {
			if(n % i == 0 && isPrime(i)) {
				return i;
			}
		}
		return n;
	}
	public static boolean isPrime(long number) {
		return 	LongStream.rangeClosed(2, (long)Math.sqrt(number))
				.allMatch(n -> number % n !=0);
	}
	
}
