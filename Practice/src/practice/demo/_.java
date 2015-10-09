package practice.demo;

import static java.lang.Integer.MAX_VALUE;

//Main method with underscore has class name and some valid identifiers
public class _
{
	public static void main(String[] __A_V_)
	{
		String $ = "";
		for(int x=0; ++x < __A_V_.length; ) 
		{// for loop
			$ += __A_V_[x];
		}
		for(int x=0; ++x < __A_V_.length; ) ;
		// prints A. x increments before entering into code block
		System.out.println(__A_V_.length);
		System.out.println($);
		System.out.println(MAX_VALUE);
	}
}
