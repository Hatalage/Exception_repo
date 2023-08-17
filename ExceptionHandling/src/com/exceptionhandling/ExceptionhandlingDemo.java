package com.exceptionhandling;

public class ExceptionhandlingDemo {
public static void main(String[] args) {
	System.out.println("start");
	int a=10;
	int b=0;
	
	try {
		System.out.println("1");   //it will execute before exception line
		int div=a/b;          //exception line
		System.out.println("division: "+div);   //from this line other lines will be ignored
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		}
	catch(ArithmeticException e)
	{
		System.out.println("Error");
	}
	System.out.println("Thank You");
	System.out.println("End");
}
}
