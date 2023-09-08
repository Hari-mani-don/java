import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a Float value : ");
	    
        float a[] = new float[2];
    
        a[0] = scan.nextFloat();
        a[1] = scan.nextFloat();
	    
	    
	    System.out.println("You are entered :" + a[0] + "\n" + a[1]);
	}
}
