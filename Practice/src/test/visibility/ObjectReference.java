package test.visibility;

public class ObjectReference
{
	String name = "Object Reference";
	
	ObjectReference changeName(ObjectReference o)
	{
		o.name = "Changed name...";
		return o;
	}
	
	void changeNameWithoutReturn(ObjectReference o)
	{
		o = new ObjectReference();
		o.name = "without reference";
		
	}

	public static void main(String[] args)
	{
		
		ObjectReference o = new ObjectReference();
		ObjectReference or = new ObjectReference();
		
		System.out.println("++++++++++++++++++++++");
		System.out.println("Before changed....");
		System.out.println("++++++++++++++++++++++");
		System.out.println("o: " + o.name +  " or: " + or.name);
		System.out.println("------------------------");
		System.out.println();
		
		o.changeNameWithoutReturn(o);
		or = o.changeName(or);
		
		System.out.println("++++++++++++++++++++++");
		System.out.println("After changed....");
		System.out.println("++++++++++++++++++++++");
		System.out.println("o: " + o.name +  " or: " + or.name);
		System.out.println("------------------------");
		System.out.println();
		
		

	}

}
