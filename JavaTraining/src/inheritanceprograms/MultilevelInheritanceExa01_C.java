package inheritanceprograms;

public class MultilevelInheritanceExa01_C extends MultilevelInheritanceExa01_B  {

	public static void main(String[] args) {

		MultilevelInheritanceExa01_C obj = new MultilevelInheritanceExa01_C();
		
		obj.run();
		obj.laugh();
		obj.eat();
		
		
	}

	public void run()  {
		
		System.out.println("I am running");
	}
	
	
}
