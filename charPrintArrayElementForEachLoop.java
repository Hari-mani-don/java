import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    int size;
	    System.out.print("Enter a Array Length: ");
	    size = scan.nextInt();
	    
	    char a[] = new char[size];
	    System.out.println("Enter Character Array element: ");
	    for(int i = 0; i < size; i++){
	        a[i] = scan.next().charAt(0);
	    }
	    
	    System.out.print("You are entered Character Array element: ");
	    for(char arr : a)
	        System.out.print(arr + " ");
	   
	    
	    
	}
}
