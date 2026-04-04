package Javapackage;

public class VariableTypesExample {
	
	
		//Global Variable 
	int a = 100;
	int b = 333;
	
		//Static Variable
	static int c = 500;
	

	public static void main(String[] args) {
		
		
		//Local Variable
		int b = 200;
		//Calling Local Variable
		System.out.println(b);
		
		
		//Calling Global Variable (We have to create an object of the class to calling or run Global Variable).
		VariableTypesExample obj=new VariableTypesExample();
		System.out.println(obj.a);
		System.out.println(obj.b);
		//Calling Static Variable 
		System.out.println(c); 

		
		
		
	}

}
