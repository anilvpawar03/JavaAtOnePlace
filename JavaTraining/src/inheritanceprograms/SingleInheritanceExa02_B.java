package inheritanceprograms;

public class  SingleInheritanceExa02_B extends SingleInheritanceExa02_A {

	
	public void multiply (int x , int y)
    {
		z = x * y;
		
		System.out.println("Multiplication is : " +z);

    }
	
	
	public static void main(String[] args) {

		SingleInheritanceExa02_B obj = new SingleInheritanceExa02_B();
		
		obj.add (20 , 30);
		obj.multiply (40 , 60);
		
	}

}
