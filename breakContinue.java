import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   
	    Scanner scan = new Scanner(System.in);
	     int i, j, n;
	     System.out.print("Enter a number: ");
	     n = scan.nextInt();
	     
	    outer:
	    for(i=0;i<n;i++){
	        inner:
	        for(j=0;j<n;j++){
	            if(i%2==0){
	                System.out.print("*");
	                break inner;
	            }
	            if(j==3){
	               System.out.print(" ");
	               continue inner;
	            }
	             System.out.print("*");
	        }
	        System.out.println();
	    }
		
	}
}
