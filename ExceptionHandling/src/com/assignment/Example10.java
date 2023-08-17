package com.assignment;
//WAP to throw exception still finally should get executed
public class Example10 {
	public static void main(String[] args) {
		try
		{
			int div = 10 / 0;
			System.out.println(div);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("always excuted");
		}

	}

}
