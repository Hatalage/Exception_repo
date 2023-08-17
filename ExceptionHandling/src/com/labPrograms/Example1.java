 package com.labPrograms;
public class Example1 {
public static void sortDescending(int a[])
{
	int temp;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(a[j]<a[j+1])
			{
				temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int n:a)
	{
		System.out.println(n);
	}
}
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9};
	try {
		sortDescending(a);
	}
	catch(Exception e)
	{
		System.out.println("Message: "+e.getMessage());
	}
}
}
