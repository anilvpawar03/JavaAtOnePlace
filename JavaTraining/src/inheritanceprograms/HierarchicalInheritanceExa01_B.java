package inheritanceprograms;

import inheritanceprograms.*;

public class HierarchicalInheritanceExa01_B {

	public static void main(String[] args) {

		
		Dog dog=new Dog();
		dog.eat();
		dog.bark();
		
		System.out.println("_____________________________");
		
		Cat obj=new Cat();
		obj.eat();
		obj.meow();
	}

}
