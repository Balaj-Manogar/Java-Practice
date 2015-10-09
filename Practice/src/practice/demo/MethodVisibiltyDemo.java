package practice.demo;

import test.visibility.DefaultModifierOnMethod;

public class MethodVisibiltyDemo
{
	

	public static void main(String[] args)
	{
		DefaultModifierOnMethod method = new DefaultModifierOnMethod();
		// this method has no or default modifier
		// hence it is accessible only on same package.
		// method.printHello();
		method.printHi();

	}

}
