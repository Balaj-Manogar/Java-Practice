package practice.generic;

public class ArrayReference
{

	public static void main(String[] args)
	{
		MainArray[] main = new MainArray[3];
		SubArray[] sub = new SubArray[8];

		MainArray[] mainRef = new MainArray[5];
		mainRef[0] = new MainArray();
		mainRef = sub;
		mainRef[7] = new SubArray();
		
	}

}

class MainArray
{

}

class SubArray extends MainArray
{
	public SubArray()
	{
		System.out.println("Sub Array");
	}
}