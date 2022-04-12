package com.ecom.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecom.entity.Customer;
import com.ecom.entity.Product;
import com.ecom.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;

	String driverName = "org.postgresql.Driver";
	String connectionUrl = "jdbc:postgresql://localhost/";
	String dbName = "student";
	String userId = "postgres";
	String password = "postgres";
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	public static boolean is_vaild_password(String password) {
		int n = password.length();
		boolean hasLower = false, hasUpper = false, hasDigit = false, specialChar = false;
		Set<Character> set = new HashSet<Character>(
				Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));
		for (char i : password.toCharArray()) {
			if (Character.isLowerCase(i))
				hasLower = true;
			if (Character.isUpperCase(i))
				hasUpper = true;
			if (Character.isDigit(i))
				hasDigit = true;
			if (set.contains(i))
				specialChar = true;
		}
		if (hasDigit && hasLower && hasUpper && specialChar && (n >= 8))
			return true;
		else
			return false;
	}

	@RequestMapping("/deletingCustomer")
	public String deletingCustomer(int id) {
		customerService.deleteCustomer(id);
		return "admincontrol.jsp";
	}

	// yes changes
	@RequestMapping("/customeradd")
	public String addingCustomer(Customer c) throws ClassNotFoundException, SQLException {
		String Cpassword = c.getCpassword();
		String Cemail = c.getCemail();
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class.forName("org.postgresql.Driver");
		connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
		statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		// System.out.println(name);
		resultSet = statement.executeQuery("select * from Customer where Cemail=" + "'" + Cemail + "'");
		resultSet.last();
		// System.out.println(resultSet.getRow());
			if(resultSet.getRow() > 0) {
				System.out.println(Cemail + "--> e-mail already exists");
				return "customeradd.jsp";
			} else if(!is_vaild_password(Cpassword)) {
				System.out.println("Your Password is : " + Cpassword);
				System.out.println("Your password should contain at least one lowercase English character.\r\n"
						+ "Your password should contain at least one uppercase English character.\r\n"
						+ "Your password should contain at least one special character. The special characters are: !@#$%^&*()-+\r\n"
						+ "Your password's length should be at least 8.\r\n"
						+ "Your password should contain at least one digit.");
				return "customeradd.jsp";
			}
		 else {
			customerService.addCustomer(c);
			return "customerSignIn.jsp";
		}
	}
	/*
	 * @RequestMapping("/updateCustomer") public String updateCustomer(Customer c)
	 * throws ClassNotFoundException, SQLException { int Cid=c.getCid(); try {
	 * Class.forName(driverName); } catch (ClassNotFoundException e) {
	 * e.printStackTrace(); } Class.forName("org.postgresql.Driver"); connection =
	 * DriverManager.getConnection(connectionUrl + dbName, userId, password);
	 * statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
	 * ResultSet.CONCUR_READ_ONLY); System.out.println(Cid); ResultSet resultSet =
	 * statement.executeQuery("select * from Customer where Cid=" + "'" + Cid +
	 * "'"); resultSet.last(); System.out.println(resultSet.getRow()); if
	 * (resultSet.getRow() == 0) {
	 * System.out.println("Customer with Id = "+Cid+" does not exists"); return
	 * "customeradd.jsp"; } else { customerDao.save(c); return "customeradd.jsp"; }
	 * }
	 */

	/*
	 * @RequestMapping("/deleteCustomer") public String
	 * deleteCustomer(@PathVariable("Cid") int Cid) { customerDao.deleteById(Cid);
	 * return "viewcustomer.jsp"; }
	 */

	@RequestMapping("/customer")
	public String customer() {
		return "customerdisplay.jsp";
	}

	@RequestMapping("/addCustomer")
	public String addCustomer() {
		return "customeradd.jsp";
	}

	@RequestMapping("/customersignin")
	public String signInCustomer() {
		return "customerSignIn.jsp";
	}

	@RequestMapping("/signin")
	public String welcomeCustomer() {
		/*
		 * try { Class.forName(driverName); } catch (ClassNotFoundException e) {
		 * e.printStackTrace(); } try { connection =
		 * DriverManager.getConnection(connectionUrl + dbName, userId, password);
		 * statement = connection.createStatement(); String sql =
		 * "SELECT * FROM Product";
		 * 
		 * resultSet = statement.executeQuery(sql); while (resultSet.next()) {
		 * System.out.println("id = " + resultSet.getString("Pid"));
		 * System.out.println("name = " + resultSet.getString("Pname"));
		 * System.out.println("price = " + resultSet.getString("Pprice"));
		 * System.out.println("category = " + resultSet.getString("Pcategory")); } }
		 * catch (Exception e) { e.printStackTrace(); }
		 */
		return "showproduct.jsp";
	}

	@RequestMapping("/firstpagecustomer")
	public String firstPageCustomer() {
		return "customerdisplay.jsp";
	}

	@RequestMapping("/movetohomepage")
	public String moveToHomePage() {
		return "Home.jsp";
	}

	@RequestMapping("/searchedproduts")
	public String searchedProducts(Product p) throws ClassNotFoundException, SQLException {
		String name = p.getPname();
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class.forName("org.postgresql.Driver");
		connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
		statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		System.out.println(name);
		resultSet = statement.executeQuery("select * from Product where Pname=" + "'" + name + "'");
		resultSet.last();
		System.out.println("row count ===== " + resultSet.getRow());
		if (resultSet.getRow() < 1) {
			System.out.println(name + "--> product does not exists");
		} else {
			System.out.println(name + " exists");
		}
		return "showproduct.jsp";
	}

}