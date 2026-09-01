package task4;

	//Create an Employee class with methods to calculate salary.

public class Employee {

	//Data Members 
	String name;
	int basicSalary;
	int bonus;
	
	//Method to calculate salary
	int calculateSalary()    {
		return basicSalary + bonus;
	}
	
	// Method to display employee's salary details 
	void display()   {
		System.out.println("Employee Name: " + name);
		System.out.println("Basic Salary: " + basicSalary);
		System.out.println("Bonus: " + bonus);
		System.out.println("Total Salary: " + calculateSalary());
	}
	
	public static void main(String[] args) {
		 Employee obj = new Employee();
		 
	//Assigning Values 
		 obj.name = "Anil";
		 obj.basicSalary = 20000;
		 obj.bonus = 5000;
		 
		 //Calling Display Method
		 obj.display();
		 
			
		
	}

}
