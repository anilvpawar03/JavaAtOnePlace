package exceptionhandling;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		//Outer try block
		try  {
			
			//Inner try Block
			try {
				String str[] = {"Pune", "Mumbai", "Nashik"};
				System.out.println(str[0]);
			}
			
			//Inner catch block
			catch (ArrayIndexOutOfBoundsException aee)  {
				System.out.println("Array Exception");
			}
			
			int a = 10;
			int b = 0;
			int c = a / b;
		}
		//outer catch block
		catch(ArithmeticException ae)  {
			System.out.println("Arithmetic Exception");
		}
			
	}

}
