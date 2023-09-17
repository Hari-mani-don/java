package Hari;
import java.util.ArrayList;
public class Main{
	public static void main(String args[]) {
	     ArrayList<String> array = new ArrayList<String>();
         array.add("Hari");
         array.add("Mani");
         System.out.println("Original Array element : "+array);
         
         array.replaceAll(str ->str.toLowerCase());
	     System.out.println(array);
	     array.replaceAll(str ->str.toUpperCase());
	     System.out.println(array);
	}
}
