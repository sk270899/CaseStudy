package com.ac.service;

import com.ac.DAO.BookDAO;
import com.ac.bean.Book;

public class BookService {
	public int addBookService(int BookId, String Booktitle, float Bookprice) {
		String Bookgrade = "";

		// condition check for book grade setting
		if (Bookprice <= 300) {
			Bookgrade = "C";
		} else if (Bookprice <= 600) {
			Bookgrade = "B";
		} else {
			Bookgrade = "A";
		}

		// DAO object created to add book to database
		BookDAO pDAO = new BookDAO();

		// book object to set values
		Book Book = new Book();
		Book.setBookId(BookId);
		Book.setBookTitle(Booktitle);
		Book.setBookPrice(Bookprice);
		Book.setBookGrade(Bookgrade);

		int updateResult = 0;

		// try and catch block if any exception occours
		try {
			updateResult = pDAO.addBook(Book); // 8.
			return updateResult; // 19.
		} catch (Exception ex) {
			System.out.println(ex.toString());
			return 0;
		}
	}
}
