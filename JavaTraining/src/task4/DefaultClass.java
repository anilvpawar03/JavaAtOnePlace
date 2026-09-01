package task4;

	//Demonstrate default constructor. 

public class DefaultClass {
	
		String name;
	    int age;
	    
	    // Default Constructor                                     										
	    																			
	    DefaultClass()  {
	        name = "Vijay";
	        age = 24;
	    }

	    // Method to display details
	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	    public static void main(String[] args) {

	        // Creating object
	    	DefaultClass df = new DefaultClass();

	        // Displaying values
	        df.display();
	    }
	}
	
	
	
	
	
	
	
	

