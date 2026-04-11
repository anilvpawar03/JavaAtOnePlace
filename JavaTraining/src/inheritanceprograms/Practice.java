package inheritanceprograms;

class A {
	void eat()
	{
		System.out.println("I am Eating");
	}
}

class B extends A{
	void dance()
	{
		System.out.println("I am dancing");
	}
}
	
class D extends B{
	void bark()
	{
		System.out.println("I am barking");
	}
}

	
class Practice extends D  {
		
    public static void main(String[] args) {
	Practice obj = new Practice();
     obj.dance();
     
     obj.bark();
    obj.eat();
  
    }
   
}	 

