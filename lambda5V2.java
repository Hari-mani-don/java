package Hari;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String args[]){
		List<Integer> number = Arrays.asList(2,3,4,5,6);
		
		List<Integer> oddNumbers = number.stream()
				.filter(n -> (n %2 ==1))
				.collect(Collectors.toList());
		System.out.println("Odd Number are: "+oddNumbers);
	}
}
