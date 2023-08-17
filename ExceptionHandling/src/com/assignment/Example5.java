package com.assignment;
//WAP where only try and finally is used 
public class Example5 {
public static void main(String[] args) {
	int a=10;
	int b=0;
	try {
		int div=a/b;
		System.out.println("div:");
	}
	finally {
		System.out.println("Execute the code");
	}
	System.out.println("End");
}
}
