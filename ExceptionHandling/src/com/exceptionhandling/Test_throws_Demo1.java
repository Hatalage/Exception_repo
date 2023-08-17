package com.exceptionhandling;

import java.io.IOException;

public class Test_throws_Demo1 {
public void m1() throws IOException, ClassNotFoundException 
{
	System.out.println("Code.....");
}
public void m2() throws IOException,ClassNotFoundException
{
	m1();
}
public void m3()
{
	try {
		m2();
	}
	catch(IOException e)
	{
		System.out.println(e.getMessage());
	}
	catch(ClassNotFoundException e)
	{
		System.out.println(e.getMessage());
	}
}
public static void main(String[] args) {
	Test_throws_Demo1 o=new Test_throws_Demo1();
	o.m3();
}
}
