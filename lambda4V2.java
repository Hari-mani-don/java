package Hari;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String args[]){
		List<String> word = Arrays.asList("hari", "mani","done");
		
		word.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
		
		System.out.println("Sorted: "+word);
		
	}
}
