package com.exceptionhandling;

public class CompileTimeExceptionDemo2 {
public static void main(String[] args) {
	System.out.println("------Start-----");
	try {
		Class clsname=Class.forName("com.exceptionhandling.CompileTimeExceptionDemo2");
		System.out.println("Class Name: "+clsname);
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("please check name of class");
	}
	System.out.println("------End-----");
}
}
