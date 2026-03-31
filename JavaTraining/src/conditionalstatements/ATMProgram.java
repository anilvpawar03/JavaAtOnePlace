package conditionalstatements;

import java.util.Scanner;

public class ATMProgram {

	public static void main(String[] args) {
 
	Scanner sc = new Scanner(System.in);
	
		int correctPin = 1234;
		int enteredPin;
		int balance = 10000;
		
		System.out.println("Welcome to ATM");
		System.out.println("Enter your PIN");
		
		enteredPin = sc.nextInt();
		
		//PIN Check
		if (enteredPin == correctPin)  {
			System.out.println("PIN Verified Successfully");
			
			System.out.println("1.Balance Enquiry");

			System.out.println("2.Withgrawal");
			
			
			int option = sc.nextInt();
			
			//Option selection 
			
			if (option == 1) {
				System.out.println("Your Current Balance is :"+balance); }
				
				else if (option == 2)  {
					System.out.println("Enter amount to withdraw :");
					
								int amount = sc.nextInt();
								
								if (amount <= balance) {
									balance = balance - amount;
									
									
			System.out.println("Withdrawal Successfull");
			
			System.out.println("Remaining Balance :"+balance);
			  
			
			System.out.println("Your Transaction is Successfull");
			System.out.println("Thank You");
			
			
								}
					
					
				}
			}
			
			
		
		
		
	}

}
