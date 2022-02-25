package com.ac.Ui;

import java.util.Scanner;

import com.ac.service.BookService;

public class BookUi {

	// main layer asking end user for the book details
	public static void main(String[] args) {
		int BookId = 0;
		String BookTitle = "";
		float BookPrice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book proId");
		BookId = sc.nextInt();
		System.out.println("Enter Book Titile");
		BookTitle = sc.next();
		System.out.println("Enter Book price");
		BookPrice = sc.nextFloat();
		BookService BookService = new BookService();
		int updateCount = BookService.addBookService(BookId, BookTitle, BookPrice);
		System.out.println("inserted " + updateCount + " record : Success");
		sc.close();
	}

}
