package abstractionprograms;

//Refer AbstractMethod Concept(yt)

abstract class Programming 
{
	public abstract void Developer();
	public abstract void Rank();
}

abstract class HTML extends Programming
{
	@Override 
	public void Developer()
	{
		System.out.println("Tim Berners Lee");
	}
}

class Java extends HTML 
{
	@Override
	public void Rank()
	{
		System.out.println("2nd");
	}
}


public class AbstractMethod {

	public static void main(String[] args) {
			Programming obj = new Java();
			obj.Developer();  
			obj.Rank();
		
	}

}
