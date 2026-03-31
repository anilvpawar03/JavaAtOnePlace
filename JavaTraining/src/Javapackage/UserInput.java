package Javapackage;

import java.util.Scanner;   //IMP
		//Import scanner class to take input from keyboard or user.

public class UserInput {

	public static void main(String[] args) {   
		
		    Scanner sc = new Scanner(System.in);   //IMP
		    //Scanner object created and basically it is used to take input from user.
			//sc = object name 
			//System.in = take input from keyboard
		    
		              //........................//

	     	System.out.println("Enter Number :");     
	     	//prints message asking user to enter integer.
		    int num1=sc.nextInt();     //nextInt():method to read integer input 
			System.out.println("Enter Number is :"+num1);
			
			
			System.out.println("Enter Decimal Number :");
			float num2=sc.nextFloat();   //nextFloat(): method to read decimal input 
			System.out.println("Enter Decimal Number Is :"+num2);
			
			
			System.out.println("Enter Name :");
			String str=sc.next();              //String :Datatype for text
			System.out.println("Name is:"+str);  
			
			
			System.out.println("Enter Boolean Value :");//Boolean value is true or false 
			boolean bn=sc.nextBoolean();
			System.out.println("Boolean value is:"+bn);
			
			
			System.out.println("Enter Character");
			//Asking user to enter single character .
			char ch=sc.next().charAt(0);
			//char:datatype for single character 
			/*charAt()if this bracket contains 0,1,2,3,4,...print that number's character from that mentioned word.
			 * like here we mentiond "0"  that means we are expecting result of 1st letter as output from input.
			 */
			System.out.println("Character is "+ch);
		}
		
		
		
		
	}


