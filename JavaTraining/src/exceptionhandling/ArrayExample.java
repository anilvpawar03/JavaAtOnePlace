package exceptionhandling;
          /*
           * Array Index Out Of Bounds Exception 
           * (When we try to access the index more than it's limit)
           */

public class ArrayExample {

	public static void main(String[] args) {
		
		try  {
		
		String name[] = {"Deepak","Anil","Naina","Vinay","Samir"};
		System.out.println(name[10]);
	}
		catch (Exception e )   {
			
			System.out.println("Please Enter the Valid Index Number");
		}
		
		System.out.println("Hello All.....");
		}
}
