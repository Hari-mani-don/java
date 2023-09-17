package Hari;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String args[]){
		List<Double> number = Arrays.asList(3.5,7.5,4.3,4.7,5.1);
		
	  double average = number.stream()
			  .mapToDouble(Double::doubleValue)
			  .average()
	          .orElse(0.0);
		
	  System.out.println("Sum of :"+average);
		
	}
}
