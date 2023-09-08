import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    int size;
	    System.out.print("Enter a Array Length: ");
	    size = scan.nextInt();
	    
	    int a[] = new int[size];
	    System.out.println("Enter Array element: ");
	    for(int i = 0; i < size; i++){
	        a[i] = scan.nextInt();
	    }
	    
	    System.out.print("You are entered Array element: ");
	    for(int arr : a)
	        System.out.print(arr + " ");
	   
	    
	    
	}
}
