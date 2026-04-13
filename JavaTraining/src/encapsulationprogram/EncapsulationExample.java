 package encapsulationprogram;


class x {
	
	private int value;   //Data Hiding
	
	//Setter Method
	public void setValue(int x)   {
		
		value = x;
	}
	
	//Getter Method
	public int getValue()   {
		
		return value;
	}
	
	
}

public class EncapsulationExample {

	public static void main(String[] args) {
		x obj = new x();
		obj.setValue(100);
		System.out.println(obj.getValue());
	}

}
