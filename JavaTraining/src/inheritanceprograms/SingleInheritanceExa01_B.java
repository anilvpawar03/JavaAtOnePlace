package inheritanceprograms;

public class SingleInheritanceExa01_B extends SingleInheritanceExa01_A    {

	public static void main(String[] args) {

		
		/*
		 * Here- SingleInheritanceExa01_B is a Child class and  SingleInheritanceExa01_A is a Parent class
		 * use 'extends' keyword to aquire's the properties from parent class into child class 
		 * 
		 */
		
		SingleInheritanceExa01_B obj = new SingleInheritanceExa01_B(); //First we have to create object to execute.
		
		String name = "Vinay";
		String aadhar = "Identity card";
		
		
	//	Now Execute_
		System.out.println(obj.id);
		System.out.println(name);
		System.out.println(obj.city);
		System.out.println(obj.state);
		System.out.println(aadhar);
		
		
		
		
	}

}
