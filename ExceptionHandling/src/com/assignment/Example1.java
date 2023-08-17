package com.assignment;

import java.util.Scanner;

//WAP which throws ArrayIndexOutBoundsException. 
//In the console, observe the stack trace and the line number from where the Exception is thrown. 
public class Example1 {
public static void main(String[] args) {
	int num[]=new int[5];
	int len=num.length;
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<=len;i++)
	{
		System.out.println("Enter an element");
		num[i]=sc.nextInt();
	}
	System.out.println("--------Array--------");
	for(int i=0;i<=len;i++)
	{
		System.out.println(num[i]);
	}
}
}
