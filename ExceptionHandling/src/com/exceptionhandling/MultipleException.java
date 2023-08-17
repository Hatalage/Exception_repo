package com.exceptionhandling;

public class MultipleException {
public static void main(String[] args) {
	String name=null;
	int num[]= {4,5,6};
	int a=10;
	int b=0;
	
	try {
		int div=a/b;
		System.out.println("div: "+div);
		System.out.println("array: "+num[10]);
		System.out.println(name.length());
	}
	catch(ArithmeticException e)
	{
		System.out.println("Please do not divide no by Zero");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Plese check index number");
	}
	catch(RuntimeException e)
	{
		System.out.println("Runtime exception");
	}
	catch(Exception e)
	{
		//general exception block
		System.out.println(e.getMessage());
	}
	System.out.println("rest of the code");
}
}
