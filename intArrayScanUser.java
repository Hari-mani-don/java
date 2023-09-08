import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a Integer : ");
	    
        int a[] = new int[2];
    
        a[0] = scan.nextInt();
        a[1] = scan.nextInt();
	    
	    
	    System.out.println("You are entered :" + a[0] + "\n" + a[1]);
	}
}
