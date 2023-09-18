package Hari;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main{
	public static void main(String args[]) {
		List<Integer> number = Arrays.asList(1,2,2,3,1,4,5,5,6,6,7);
		List<Integer> mani = Arrays.asList(1,3,4,5,6,2,0,0);
		List<Integer> num = new ArrayList();
		 mani.stream()
				.distinct()
				.forEach(num::add);
		System.out.println("Remove dupicate: "+num);
		
	}
}
