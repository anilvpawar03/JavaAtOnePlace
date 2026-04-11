package task3;
import java.util.Scanner;
public class TaskScanner {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
                //Sum of a+b > c+d
		
		 System.out.print("Enter a:");
	     int a = sc.nextInt();

		 System.out.print("Enter b:");
		 int b = sc.nextInt();

         System.out.print("Enter c:");
		 int c = sc.nextInt();

		 System.out.print("Enter d:");
		 int d = sc.nextInt();

		    if ((a + b) > (c + d)) 
		    {
		       System.out.println("Sum of a and b is greater than sum of c and d");
		    } 
		     else 
		     {
		       System.out.println("Sum of a and b is NOT greater than sum of c and d");
		     }
		    
		    
		    
		    //Swapping
		    
		     System.out.print("Enter x number:");
		     int x = sc.nextInt();

		     System.out.print("Enter y number:");
		     int y = sc.nextInt();

		     int temp = x;
		     a = y;
		     y = temp;

		      System.out.println("After swapping:");
		            System.out.println("a = " + x);
		            System.out.println("b = " + y);
		            
		            
		            
	}
}
		           
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		            
		
	















