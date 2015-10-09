package test.visibility;

public class Bottom extends Top
{
	// super() is not allowed throws error 
	public Bottom(String s)
	{
		//super(s); this will remove error
		System.out.println("Bottom");
	}

	public static void main(String[] args)
	{

	}

}
