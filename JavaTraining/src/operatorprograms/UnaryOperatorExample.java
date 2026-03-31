package operatorprograms;

public class UnaryOperatorExample {

	public static void main(String[] args) {

	
		int a = 10;
		int b = 99;
		
		/*This is post increment 
		 * In Post Increment ,current value will get first ,
		 * then it will get increment
		 */
		System.out.println(a++);//10
		System.out.println(a);//11                    //Consider Latest Values always 
		System.out.println(a++);//11
		System.out.println(a);//12
		
		
		/*
		 * In Pre Increment ,Value will get increment first then
		 * will get printed
		 */
		
		System.out.println(++b); //100
		System.out.println(a++ + ++b);//12+101=113
		
	}

}
