package com.exceptionhandling;

public class Demo_throw_keyword {
public void checkAge(int age)
{
	if(age<35)
	{
		//explicitly throw exception
		throw new ArithmeticException("Candidate is not eligible for this designation");
		//System.out.println("not valid");
	}
	else
	{
		System.out.println("Welcome....please fill the form details");
	}
}
public static void main(String[] args) {
	System.out.println("--------start-----");
	Demo_throw_keyword dm = new Demo_throw_keyword();
	try {
		dm.checkAge(15);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Message: "+e.getMessage());
	}
	System.out.println("------End-----");
}
}
