package com.exceptionhandling;

public class ExceptionHandlingDemo3 {
public static void divide()
{
	int a=10;
	int b=0;
	try {
		int div=a/b;
		System.out.println("div: "+div);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
public static void main(String args[])
{
	System.out.println("in main method");
	divide();
	System.out.println("end");
}
}
