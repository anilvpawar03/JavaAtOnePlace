package polymorphismprograms;

public class MethodOverridingExample01_B extends MethodOverridingExample01_A {

	
	public void eat()  {
		//super.eat();
		System.out.println("You are eating");
	}
	
	
	public static void main(String[] args) {

		MethodOverridingExample01_B obj = new MethodOverridingExample01_B();
		
		obj.eat();        
		/* method is same for both but which is going execute is decided by object 
		 * Whichever class's object we created that run's first.
		 * i.e.Child class 
		 * 
		 *If we have to execute both methods then for that we have to use "super" keyword.
		 *If we remove super keyword then it would be decided at Runtime that which Method will be executed 
		 *       i.e. Basically it is decided by Object.
		 */
		
		
		
		
		
	}

}
