import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    int size;
	    System.out.print("Enter a Array Length: ");
	    size = scan.nextInt();
	    
	    int a[] = new int[size];
	    
	    //Scan Array value
	    System.out.println("Enter  Array element: ");
	    for(int i = 0; i < size; i++){
	        a[i] = scan.nextInt();
	    }
	    
	    System.out.print("Before array Sorted: ");
	    for(int sort : a)
	         System.out.print(sort + " ");
	         
	         
	    //Swap Array Accending
	    
	    for(int i = 0; i < size; i++){
	        for(int j = i + 1; j < size; j++){
	            if(a[i] > a[j]){
	                int temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }
	    }
	    
	    //After Swap Printing
	    System.out.print("\nAfter Accending order Sorted: ");
	    for(int arr : a)
	        System.out.print(arr + " ");
	   
	    
	    
	}
}
