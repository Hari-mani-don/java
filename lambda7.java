package Hari;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Main{
	public static void main(String args[]) {
		List<Integer> number = Arrays.asList(1,2,2,3,1,4,5,5,6,6,7);
		
		System.out.println("Original element:"+number);
		List<Integer> duplicate = number.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("Remove dupicate: "+duplicate);
	}
}
