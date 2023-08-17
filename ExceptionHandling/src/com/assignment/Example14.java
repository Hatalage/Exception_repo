package com.assignment;

import java.io.IOException;

public class Example14 {
	public static void method1() throws IOException 
	{
		
		System.out.println("Inside method 1");
		 method2();
	}
	public static void method2()throws IOException 
	{
		
		System.out.println("Inside method 2");
		method3();
	}
	public static void method3() throws IOException 
	{
        throw new IOException("This is a checked exception");
	}   
        
	public static void main(String[] args) {
		 try {
	            method1();
	        } catch (IOException e) {
	            System.out.println("Caught exception: " + e.getMessage());
	        }

}

}

