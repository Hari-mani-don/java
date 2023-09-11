public class AnonymousInterface {

	public static void main(String[] args) {
		//Anonymous class In interface
		Demo demo = new Demo() {
			public void hari() {
				System.out.println("Hair");
			}
		};
		demo.hari();
	

	}

}

interface Demo{
	void hari();
	
}
