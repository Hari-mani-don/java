//Hollow Right triangle Pattern


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    int n;
	    System.out.print("Enter Number of Rows: ");
	    n = scan.nextInt();
	    
	    //Print pyramid
	    for(int i = 1; i <= n; i++){
	        for(int j = 1; j <= i; j++){
	            if(j == 1 || j == i || i == n){
	                System.out.print("*");
	            }else{
	                System.out.print(" ");
	            }
	        }
	        System.out.print("\n");
	    }
	    
	   
	   
	    
	    
	}
}
