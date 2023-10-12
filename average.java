package Mani;

import java.util.Scanner;

public class New{    
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int total = 0;
         for(int i=1;i<= 5;i++) {
        	 System.out.print("Enter the number:");
        	 total += sc.nextInt();
         }
         System.out.println("Average of : "+ (total /5));
    }
}
