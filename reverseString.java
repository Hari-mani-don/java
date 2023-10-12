package Mani;



public class New{    
    public static void main(String[] args) {
    	//This is a string
    	String name = "hari";
    	//Before print name
    	System.out.println(name);
    	//reverse name
    	for(int i =1;i<=name.length();i++) {
    		System.out.print(name.charAt(name.length()-i));
    	}
    }
}
