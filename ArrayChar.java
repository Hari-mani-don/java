//for each loop

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   
	    Scanner scan = new Scanner(System.in);
	    char arr[]=new char[5];
	     System.out.print("Enter a number: ");
	     for(int i=0;i<5;i++){
	         arr[i] =  scan.next().charAt(0);
	     }
	     
	     
	     System.out.print("Array elements are :");
	     for(char j:arr)
	          System.out.print(j + " ");
	     
	     
		
	}
}
