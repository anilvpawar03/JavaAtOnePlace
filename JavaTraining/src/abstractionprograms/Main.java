package abstractionprograms;

public class Main extends Test {

	public static void main(String[] args) {
		
		/*
		 * We cannot create an object of abstract and interface
		 */
		Main obj = new Main();
		obj.a();
		obj.eat();
		
		
	}

	
	
	
	@Override
	void eat() {
		System.out.println("I am eating");
	}

}
