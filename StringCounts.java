package Mani;
public class New{    
    public static void main(String[] args) {
    	
    	//The input string
    	String name = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
    	
        int letter = 0; //Variable to count letter
        int space =0;  //Variable to count space
        int number =0; //Variable to count number 
        int other =0 ; //Variable to count other character
        
    	//Iterate through each character
    	for(int i = 0; i < name.length(); i++) {
    		if(Character.isAlphabetic(name.charAt(i))) {
    			//Increment the letter count
    			letter++;
    		}else if(Character.isDigit(name.charAt(i))) {
    			//Increment the number count
    			number++;
    		}else if(Character.isSpaceChar(name.charAt(i))) {
    			//Increment the space count
    			space++;
    		}else {
    			//Increment the other character count
    			other++;
    		}
    	}
    	
        //Output the counts
    	System.out.println("letter : "+letter);
    	System.out.println("number : "+number);
    	System.out.println("space  :" +space);
    	System.out.println("other  :" +other);
    }
}
