package com.assignment;
//WAP to catch multiple exceptions.
//i.e ArrayIndexOutOfBoundsException and ArithmeticException 
public class Example3 {
public static void main(String[] args) {
	int num[]=new int[5];
	int a=10;
	int b=0;
	
	try {
		System.out.println("Array: "+num[10]);
		int div=a/b;
		System.out.println("Division is: "+div);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array index out of bound");
	}
	catch(ArithmeticException e)
	{
		System.out.println("Divide by zero");
	}
	catch(Exception e)
	{
		//general exception block
		System.out.println(e.getMessage());
	}
	System.out.println("rest of the code");
}
}
