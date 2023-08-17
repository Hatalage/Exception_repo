package com.assignment;
//WAP to check whether Unchecked Exception is propagated in calling stack
public class Example13 {
public static void m1()
{
	m2();
}
public static void m2()
{
	throw new RuntimeException("Uncheked Exception");
}
public static void main(String[] args) {
	try {
		m1();
	}
	catch(RuntimeException e)
	{
		System.out.println("Exception caught in main method");
	}
}
}
