package Hari;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Main{
	public static void main(String args[]) {
		
		List<String> string = Arrays.asList("hari","mani","done", "HariMani","HariMani");
	 double colors = string.stream()
			 .mapToInt(String::length)
			 .average()
			 .orElse(0);
	 System.out.println("Output:"+colors);
	}
	
}
