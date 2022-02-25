package com.ac.Ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.ac.service.BookService;

public class BookUi {

	// User layer asking end user for the book details
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 1;
		while (x == 1) {
			System.out.println("Enter numeric input : ");
			System.out.println("1. Add book");
			System.out.println("2. Display book");
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				int BookId = 0;
				String BookTitle = "";
				float BookPrice = 0;
				System.out.println("Enter Book proId");
				BookId = sc.nextInt();
				System.out.println("Enter Book Title");
				BookTitle = sc.next();
				System.out.println("Enter Book price");
				BookPrice = sc.nextFloat();
				BookService BookService = new BookService();
				int updateCount = BookService.addBookService(BookId, BookTitle, BookPrice);
				System.out.println("inserted " + updateCount + " record : Success");
				System.out.println("Enter 1 to continue or 0 to abort...");
				x=sc.nextInt();
				break;
			}
			case 2: {
				try {
					System.out.println("Enter book id to find book : ");
					int bookId = sc.nextInt();
					sc.nextLine();
					BookService bookService = new BookService();
					
					ArrayList<String> bookDetails = bookService.getBookDetailsById(bookId);
					
					System.out.println(bookDetails);
				} catch (Exception e) {
					System.out.println("invalid book id");
				}
				System.out.println("Enter 1 to continue or 0 to abort...");
				x=sc.nextInt();
				break;
			}
			default:
				System.out.println("wrong input...");
			}
		}
		sc.close();
	}

}
