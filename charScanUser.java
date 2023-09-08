import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a Character : ");
	    
        char a[] = new char[2];
    
        a[0] = scan.next().charAt(0);
        a[1] = scan.next().charAt(0);
	    
	    
	    System.out.println("You are entered :" + a[0] + "\n" + a[1]);
	}
}
