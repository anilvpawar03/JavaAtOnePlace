package task2;

public class DefaultValuesOfGlobalVariables {
	
	
	//Global Variables 
	int a;
	float b;
	double c;       //Java gives default values for Global variables and Static Variables ..
	char d;          
	boolean e;
	String f;
	
	
	public static void main(String[] args) {
    
		//We have to create object of class to execute or run the program
		DefaultValuesOfGlobalVariables obj = new DefaultValuesOfGlobalVariables();
	
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
		System.out.println(obj.f);
		
		
		
		//Local Variables Demonstration 
		
		int p = 30;
		float q = 10.2f;          // Java don't give default values for Local Variables ..
		double r = 50.20;
		char s = 'A';
		boolean t = true;
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s);
		System.out.println(t);
		
		
			}

}
