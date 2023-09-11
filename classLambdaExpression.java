
public class AnonymousInterface {

	public static void main(String[] args) {
		//Lambda Expression
		Demo demo = new Demo() {
			public void hari() {
				System.out.println("Hair");
			}
		};
		demo.hari();
		Demo de = () -> System.out.print("mani"); //lambda expression
		de.hari();
	

	}

}

interface Demo{
	void hari();  //single Abstract Method interface  (or) SAM- interface (or) functional interface
	
}
