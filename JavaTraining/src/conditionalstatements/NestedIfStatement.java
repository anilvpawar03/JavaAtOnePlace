package conditionalstatements;

public class NestedIfStatement {

	public static void main(String[] args) {

		int age = 20;
		int weight = 55;
		
		//Outer if block
		if (age >= 18) {
		//Inner block statement 
		if (weight >= 50) {
			
			
			
			System.out.println("Eligible for Blood Donation");
			
			}
		
		else {
			System.out.println("Not Eligible for Blood Donation");
			
		}   
		}	else  {
			System.out.println("Age must be Greater than 18");
		
			
		}
		}
		
	}


