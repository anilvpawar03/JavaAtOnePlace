package conditionalstatements;

public class IfElseIfExample {

	public static void main(String[] args) {

		
		int marks = 75;
		
		/*
		 * else if statement will only check the condition when if statement is false 
		 */
		if (marks>=90)  {
			System.out.println("Grade A");
			
		}
			
		else if (marks>=80)  {
			System.out.println("Grade B");
			
		}
		
		else {
			System.out.println("Grade F");
		}
	}

}
