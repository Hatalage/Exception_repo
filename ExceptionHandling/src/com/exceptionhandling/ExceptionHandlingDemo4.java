package com.exceptionhandling;

public class ExceptionHandlingDemo4 {
public static void main(String[] args) {
	int a=10;
	int b=0;
	try {
		int div=a/b;
		System.out.println("div: "+div);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Message: "+e.getMessage());
	}
	finally {
		System.out.println("always executes");
	}
	System.out.println("end");
}
}
