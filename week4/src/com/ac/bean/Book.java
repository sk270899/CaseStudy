package com.ac.bean;

//Encapsulated Book class
public class Book {

	// Data Members
	private int bookId;
	private String bookTitle;
	private float bookPrice;
	private String bookGrade;

	// Getters and setters

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookGrade() {
		return bookGrade;
	}

	public void setBookGrade(String bookGrade) {
		this.bookGrade = bookGrade;
	}

	// toString()
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookPrice=" + bookPrice + ", bookGrade="
				+ bookGrade + "]";
	}

}
