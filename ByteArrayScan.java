import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a Byte value : ");
	    
        byte a[] = new byte[2];
    
        a[0] = scan.nextByte();
        a[1] = scan.nextByte();
	    
	    
	    System.out.println("You are entered :" + a[0] + "\n" + a[1]);
	}
}
