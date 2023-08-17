package com.exceptionhandling;

import java.util.Scanner;

class BookNotFoundException1 extends Exception {
	public BookNotFoundException1(String msg)
	{
		super(msg);
	}
}
class PurchaseBook1 {
	public void checkBookId(int bookid) throws BookNotFoundException1 //for checked
	{
		if(bookid<101 ||  bookid>551)
		{
			throw new BookNotFoundException1("Please check your bookid once");
		}
		else {
			System.out.println("Your Book Found!!! Please pay at cash counter");
		}
	}
}
public class CustomExceptionTest2 {
public static void main(String[] args) {
	System.out.println("-------Welcome to BookYourBook-----");
	System.out.println("Enter book id from purchasing  book: 101 to 551 ");
	Scanner sc = new Scanner(System.in);
	int bookid=sc.nextInt();
	PurchaseBook book=new PurchaseBook();
	try {
		book.checkBookId(bookid);
	}
	catch(BookNotFoundException e)
	{
		System.out.println("message: "+e.getLocalizedMessage());
	}
	System.out.println("Thank You!!! Keep shopping");
}
}
