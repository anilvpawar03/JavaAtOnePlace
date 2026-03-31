package task2;

import java.util.Scanner;

public class CalculatorScanner {

	public static void main(String[] args) {

		
				Scanner sc = new Scanner(System.in);

		       
		        System.out.println("Enter first number:");
		        int a = sc.nextInt();  
		        
		        System.out.println("Enter second number:");
		        int b = sc.nextInt();  
		       
		        System.out.println("Enter operator (+ - * /):");
		        char ch = sc.next().charAt(0);  

		        
		        switch(ch) {
		        
		            case '+':
		                System.out.println("Result = "+ (a + b));
		                break;

		            case '-': 
		                System.out.println("Result = "+ (a - b)); 
		                break;

		            case '*': 
		                System.out.println("Result = "+ (a * b)); 
		                break;

		            case '/': 
		                System.out.println("Result = "+ (a / b)); 
		                break;

		           
		        }
		
	}
		
}	
		
		
	
