//2D Array print for Each loop


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    int a[][] = new int[2][3];
	    System.out.print("Enter Array Element: ");
	    for(int i = 0; i < 2; i++){
	        for(int j = 0; j < 3; j++){
	            a[i][j] = scan.nextInt();
	        }
	        System.out.print("\n");
	    }
	    
	    //print Array Element
	    System.out.print("You are Entered Array Element:\n");
	   for(int arr[] : a){
	       for(int j =0; j < 3; j++){
	            System.out.print(arr[j]+ " ");
	       }
	       System.out.print("\n");
	   }
	     
	    
	}
}
