package com.exceptionhandling;

import java.io.IOException;

public class ChainedExceptionTest {
public static void divide(int a,int b)
{
	try {
		int div=a/b;
		System.out.println("div:"+div);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Exception aries: "+e);
		ArithmeticException ex=new ArithmeticException();
		e.initCause(new IOException("diving number by zero.Please do not enter Zero"));
		throw e;
	}
}
public static void main(String[] args) {
	int x=10;
	int y=0;
	try {
		divide(x,y);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getCause());
	}
}
}
