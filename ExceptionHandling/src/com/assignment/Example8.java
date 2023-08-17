package com.assignment;
//WAP to show the scenario in which IndexOutBound Exception (Both ArrayInexOutOfBound and 
//StringIndexOutOfBound) exception is generated and handle this exception
public class Example8 {
	public static void main(String[] args) 
	{
		String s[]= {"maths","phy","english","chem","computer","bio"};
		String s1=new String("Hello");
		try {
			for (int i = 0; i <= s1.length(); i++) {
				System.out.println(s1.charAt(i));		
			}
		
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}

}
