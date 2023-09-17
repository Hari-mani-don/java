package Hari;
public class Main{
	public static void main(String args[]) {
	
		String s = "hari";
		str st = (a) -> {
			
			if(a.length()==0) 
				return false;
			return true;
		};
		System.out.println(st.add(s));
		
		
	}
}
interface str{
     boolean  add(String a);
}
