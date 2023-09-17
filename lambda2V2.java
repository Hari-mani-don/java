package Hari;
import java.util.function.Predicate;
public class Main{
	public static void main(String args[]) {
	
//		Predicate isEmptyString  = str -> str.
		Predicate isEmptyString = s -> ((String) s).isEmpty();
		 String s = "";
		 String a = "hari";
		 
		 System.out.println("String is "+isEmptyString.test(s));
		 System.out.println("String is "+isEmptyString.test(a));
	}
}
