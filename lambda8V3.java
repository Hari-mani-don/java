package Hari;
import java.util.function.LongUnaryOperator;
public class Main{
	public static void main(String args[]) {
		int number =7;
		LongUnaryOperator fact = n ->{
			if(n<0) {
				System.out.println("Error! ");
			}
		   long result =1;
		   for(int i=1;i<=n;i++) {
			   result*=i;
		   }
		   return result;
		};
		long a = fact.applyAsLong(number);
		System.out.println("Factorial of: "+a);
		
	}
}
