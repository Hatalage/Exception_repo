package com.exceptionhandling;
import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
	public void method1(int a) {
		System.out.println("a:" + a);
	}

	public void method2(double d) throws IOException, RuntimeException {
		System.out.println("d:" + d);
	}
}

class Child extends Parent {

	// can npot possible if superclass method does not throws any exception
	// public
//	public void method1(int a) throws IOException {
//		System.out.println("a:" + a);
//	}
	public void method1(int a) throws ArithmeticException {
		System.out.println("a:" + a);
	}

	public void method2(double d) throws FileNotFoundException, ArithmeticException {
		System.out.println("d:" + d);
	}
}

public class ExceptionOfMethodOverriding {
	public static void main(String[] args) {

	}

}