package com.assignment;

import java.io.FileWriter;
import java.io.IOException;

//WAP to show checked exception and use multiple catch block with universal Exception handler. 
public class Example4 {
public static void main(String[] args) {
	FileWriter fw=null;
	try {
		fw=new FileWriter("myfile.txt");
		String data="Java is simple programming language";
		fw.write(data);
		System.out.println("file created");
	}
	catch(IOException e)
	{
		System.out.println(e.getMessage());
	}
	finally {
		try {
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
}

