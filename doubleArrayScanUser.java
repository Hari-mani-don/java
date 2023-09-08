import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a Double value : ");
	    
        double a[] = new double[2];
    
        a[0] = scan.nextDouble();
        a[1] = scan.nextDouble();
	    
	    
	    System.out.println("You are entered :" + a[0] + "\n" + a[1]);
	}
}
