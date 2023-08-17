package com.assignment;

import java.util.Scanner;

//WAP to use catch / handle the ArrayIndexOutOfBoundsException exception. 
public class Example2 {
public static void main(String[] args) {
	int num[]=new int[5];
	int len=num.length;
	Scanner sc=new Scanner(System.in);
	try {
		for(int i=0;i<=len;i++)
		{
			System.out.println("Enter an element");
			num[i]=sc.nextInt();
		}
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e.getMessage());
	}
	System.out.println("------Array-----");
	for(int i=0;i<len;i++)
	{
		System.out.println(num[i]);
	}
}
}
