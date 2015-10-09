package test.visibility;

public class InitAndStaticBlocK
{
	static
	{ // scope will be block level
		int y = 100;
	}

	{
		int x = 10;
	}

	public InitAndStaticBlocK()
	{
		x = 12;
		y = 150;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
