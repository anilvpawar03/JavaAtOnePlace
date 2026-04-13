package constructorprograms;

    //Default Constructor//

public class Employee {

	String name ;
	
	//Constructor 
	Employee()   {
		
		name = "Anil";
				
	
	}
		
	public void display()   {
		System.out.println("My name is :" +name);
	
	}
	
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.display();
		
	}

}
