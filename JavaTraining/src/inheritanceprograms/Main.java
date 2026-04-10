package inheritanceprograms;

class A1   {

		int a = 10;
}
class Main extends A1  {
	
	public static void main(String[] args)    {
		
		Main obj = new Main();
		
		int b = 20;
		int c =obj.a+b;
		System.out.println(c);
	}
	
	
}





