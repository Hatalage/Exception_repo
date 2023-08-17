package com.assignment;
//WAP to return int value in try block and return int value in finally block and observe which return 
//takes precedence
public class Example11 {
public static void main(String[] args) {
int result =0;
try {
	result =10;
	System.out.println("Try block result: "+result);
}
finally {
	result=20;
	System.out.println("Finally block result: "+result);
}
}
}