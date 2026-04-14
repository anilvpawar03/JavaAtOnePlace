package constructorprograms;

/*
 * This Program Demonstrate Constructor Overloading 
 */

public class ConstructorOverloading {
		int id;
		String name;     //Global Variables 
		String address;
	
	//Default Constructor
		ConstructorOverloading ()  {
			System.out.println("Hello This is Default Constructor");
		}
	
	//Parameterize Constructor 
		ConstructorOverloading (int a , String b , String c )   {
			id = a;
			name = b;
			address = c;
			
		}
	
	public void display()   {
		System.out.println(id + " " + name + " " + address);
		
	}
	
		public static void main(String[] args) {

		//Default Constructor Calling 
			ConstructorOverloading obj = new ConstructorOverloading();
		
		//Parameterized Constructor's Calling
			ConstructorOverloading obj1 = new ConstructorOverloading(1, "Deepak","Nagpur");
			obj1.display();
			ConstructorOverloading obj2 = new ConstructorOverloading(2, "Anil", "Nashik");
			obj2.display();
			ConstructorOverloading obj3 = new ConstructorOverloading(3, "Naina", "Pune");
			obj3.display();
	}

}
