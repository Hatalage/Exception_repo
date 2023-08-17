package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo2 {
public static void main(String[] args) {
	int num[]=new int[5];
	int len=num.length;
	Scanner sc = new Scanner(System.in);
    try  {
    	for(int i=0;i<=len;i++)
    	{
    		System.out.println("Enter Element");
    		num[i]=sc.nextInt();
    	}
    }
    catch(ArrayIndexOutOfBoundsException e)
   {
    	System.out.println(e.getMessage());
    }
    catch(InputMismatchException e)
    {
    	System.out.println("input mismatch exception");
    }
//    System.out.println("-----Array------");
//    for(int i=0;i<len;i++)
//    {
//    	System.out.println(num[i]);
//    }
}
}
