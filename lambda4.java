package Hari;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String args[]){
		List<String> word = Arrays.asList("hari", "Mani", "done", "aim", "Aim");
		
		List<String> sort = word.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println("Odd Number are: "+sort);
	}
}
