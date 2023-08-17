package com.exceptionhandling;

public class NestedTryCatch {
public static void main(String[] args) {
	String name=null;
	int num[]= {4,5,6};
	int a=10;
	int b=0;
	
	try {
		
		//try-catch block
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		 
		//block 2
		try {
			System.out.println(name.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		//block 3
		try {
			System.out.println(num[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(10/0);
	}//main try
	catch(Exception e) {
		System.out.println("Main catch block");
	}
}
}

