
public class Anonymous {

	public static void main(String[] args) {
		//Anonymous class
		Demo demo = new Demo() {
			void hari() {
		    	System.out.print("this is a New class");
		    }
		};
		demo.hari();

	}

}

class Demo{
	void hari() {
		System.out.print("this is Normal class");
	}
	
}
