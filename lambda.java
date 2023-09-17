package Hari;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String args[]){
		List<Integer> number = Arrays.asList(2,3,4,5,6);
		
		List<Integer> evenNumber = number.stream()
				.filter(n -> (n %2 ==0) || (n==0))
				.collect(Collectors.toList());
		System.out.println("Evern Number are: "+evenNumber);
	}
}
