package Hari;
import java.util.Arrays;
import java.util.List;

public class Main{
	public static void main(String args[]) {
	      List<String> array = Arrays.asList("har", "mani");
         
         System.out.println("Original Array element : "+array);
         
         array.replaceAll(str ->str.toLowerCase());
	     System.out.println(array);
	     array.replaceAll(str ->str.toUpperCase());
	     System.out.println(array);
	}
}
