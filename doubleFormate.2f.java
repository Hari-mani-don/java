//float print in formate .2f

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    double number = 123.4534566f;
	    String formateNumber = String.format("%.2f", number);
	    System.out.printf(formateNumber);
	    
	}
}
