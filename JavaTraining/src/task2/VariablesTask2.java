package task2;

public class VariablesTask2 {

                                                           //Define and print different types of variables .
	    //Global Variable 
	int g = 100;
	
		//Static Variable 
	static int s = 200;
	
	public static void main(String[] args) {
		
		//Local Variable 
	int l = 300;
	 //So_
	System.out.println("Local Variable is:" +l);  //Print Local Variable
	
	
	//First we have to create an object of class to print or run Global variable 
	VariablesTask2 obj = new VariablesTask2();
	System.out.println("Global Variable is:"+obj.g);   //Print Global Variable 
	
	System.out.println("Static Variable is:"+s);   //Print Static Variable 
		
	
	
	
	
		
	}

}
