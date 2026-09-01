package task4;
 
	//Create a Student class and display student details. 

public class StudentDetails  {

	//Data members (Variables)
	int id;
	String name;
	int age;
	
	// Method to display student details 
	
	void display()  {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: "+ name);
		System.out.println("Student Age: "+ age);
		
	}
	
	public static void main(String[] args) {

		StudentDetails st = new StudentDetails();
		
	//Assigning Values (object.variable = value;)
		st.id = 101;
		st.name = "Anil";
		st.age = 24;
		
	//Calling display method 
		st.display();
		
	}

}
