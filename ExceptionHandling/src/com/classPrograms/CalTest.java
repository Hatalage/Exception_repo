package com.classPrograms;

import java.util.Scanner;

public class CalTest {
public static void main(String[] args) {
	Calculator c=new Calculator();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first num: ");
	int num1=sc.nextInt();
	System.out.println("Enter the second num: ");
	int num2=sc.nextInt();
	
	System.out.println("Enter choice: ");
	System.out.println("1. Addition \n 2. Subtrsction \n 3. Multiplication \n 4. Division");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1: System.out.println(c.add(num1,num2));
	break;
	
	case 2: System.out.println(c.sub(num1,num2));
	break;
	
	case 3: System.out.println(c.multiply(num1,num2));
	break;
	
	case 4: c.div(num1,num2);
	break;
	
	default: System.out.println("Enter invalid choice");
	break;
	}
}
}
