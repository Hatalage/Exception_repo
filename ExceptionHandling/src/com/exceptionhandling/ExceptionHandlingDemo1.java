package com.exceptionhandling;

public class ExceptionHandlingDemo1 {
public static void main(String[] args) {
	 
	int num[]= {45,78,88,98,40};
	int len=num.length;
	try {
		for(int i=0;i<=len;i++)
		{
			System.out.println(num[i]);
		}
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Please check array index value");
		System.out.println(e);   //classname and message
		System.out.println("Message: "+e.getMessage());
		System.out.println("Class: "+e.getClass());
		e.printStackTrace();    //class name, description and line number
	}
	System.out.println("End");
}
}
