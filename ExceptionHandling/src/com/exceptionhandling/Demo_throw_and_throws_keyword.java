package com.exceptionhandling;

import java.io.IOException;

public class Demo_throw_and_throws_keyword {
	public void checkAge(int age) throws IOException 
	{
		if(age<35)
		{
			//explicitly throw exception
			throw new IOException("Candidate is not eligible for this designation");
			//System.out.println("not valid");
		}
		else
		{
			System.out.println("Welcome....please fill the form details");
		}
	}
	public static void main(String[] args) {
		System.out.println("--------start-----");
		Demo_throw_and_throws_keyword d = new Demo_throw_and_throws_keyword();
		try {
			d.checkAge(36);
		}
		catch(IOException e)
		{
			System.out.println("Message: "+e.getMessage());
		}
		System.out.println("------End-----");
	}
	}


