package abstractionprograms;

// Refer AbstractClass Concept (yt)
abstract class animal   {
	
	animal()//Constructor    //Non abstract method
	{
		System.out.println("All animals...");
	}
	
	public abstract void sound();
}

class Dog extends animal
{
	Dog() {        //Non abstract method 
		super();  //For Calling Constructor
	}
	public void sound()
	{
		System.out.println("Dog is Barking");
	}
	
}
class Lion extends animal  
{
	Lion()  {     //  Non abstract method
		super();  //For calling Constructor
	}
	public void sound()
	{
		System.out.println("Lion is Roaring");
	}
}


class AbstractiClass {

	public static void main(String[] args) {
		
		Dog obj1 = new Dog();
		obj1.sound();
		Lion obj2 = new Lion();
		obj2.sound();
		
		
		

	}

}
