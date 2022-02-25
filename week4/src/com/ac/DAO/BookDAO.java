package com.ac.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ac.bean.Book;

public class BookDAO {

	// addBook method to create connection and add to DB
	public int addBook(Book Book) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		// try and catch if any error occurs
		try {
			conn = BookDB.getConnection();
			String ins_str = "insert into Book values(?,?,?,?)";

			pstmt = conn.prepareStatement(ins_str);
			pstmt.setInt(1, Book.getBookId());
			pstmt.setString(2, Book.getBookTitle());
			pstmt.setFloat(3, Book.getBookPrice());
			pstmt.setString(4, Book.getBookGrade());
			int updateCount = pstmt.executeUpdate();
			conn.close();
			return updateCount;
		} catch (Exception ex) {
			System.out.println(ex.toString());
			return 0;
		}
	}

	// get bookDetails method from DB

	public ArrayList<String> getBookDetailsById(int BookId) throws Exception {
		Class.forName("org.postgresql.Driver");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		conn = BookDB.getConnection();

		String sel_str = "Select Booktitle,Bookprice from Book where BookId=?";

		pstmt = conn.prepareStatement(sel_str);
		pstmt.setInt(1, BookId);
		rs = pstmt.executeQuery();

		ArrayList<String> result = new ArrayList<>();
		if (rs.next()) {
			result.add(rs.getString(1));
			result.add(rs.getString(2));

		} else {
			result.add("Invalid Id");
		}
		return result;

	}
}
