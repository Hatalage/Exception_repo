package com.classPrograms;

import java.util.Scanner;
class  NegativeAgeException extends RuntimeException{
	public NegativeAgeException(String msg) {
		super(msg);
	}
}
public class Task1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Age");
	int age=sc.nextInt();
	try {
		if(age<0)
		{
			throw new NegativeAgeException("Age should be a positive value ");
		}
		else {
		System.out.println("it's correct");
	}
}
	catch(NegativeAgeException e)
	{
		System.out.println("Message: "+e.getMessage());
		e.printStackTrace();
	}
}
}
