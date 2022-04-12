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

import com.ecom.entity.Admin;
import com.ecom.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
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
	        boolean hasLower = false, hasUpper = false,
	                hasDigit = false, specialChar = false;
	        Set<Character> set = new HashSet<Character>(
	            Arrays.asList('!', '@', '#', '$', '%', '^', '&',
	                          '*', '(', ')', '-', '+'));
	        for (char i : password.toCharArray())
	        {
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
	
	@RequestMapping("/addingAdmin")
	public String addingAdmin(Admin a) throws ClassNotFoundException, SQLException {
		String Apassword = a.getApassword();
		String Aemail = a.getAemail();
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class.forName("org.postgresql.Driver");
		connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
		statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		// System.out.println(name);
		resultSet = statement.executeQuery("select * from Admin where Aemail=" + "'" + Aemail + "'");
		resultSet.last();
		if (resultSet.getRow() > 0 || !is_vaild_password(Apassword)) {
			if(resultSet.getRow() > 0) {
				System.out.println(Aemail + "--> e-mail already exists");
				return "adminadd.jsp";
			} else if(!is_vaild_password(Apassword)) {
				System.out.println("Your Password is : " + Apassword);
				System.out.println("Your password should contain at least one lowercase English character.\r\n"
						+ "Your password should contain at least one uppercase English character.\r\n"
						+ "Your password should contain at least one special character. The special characters are: !@#$%^&*()-+\r\n"
						+ "Your password's length should be at least 8.\r\n"
						+ "Your password should contain at least one digit.");
				return "adminadd.jsp";
			}
			return "adminadd.jsp";
			// emailalredyexists.jsp
		} else {
			adminService.addAdmin(a);
			return "adminSignIn.jsp";
		}
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "admindisplay.jsp";
	}

	@RequestMapping("/addadmin")
	public String addAdmin() {
		return "adminadd.jsp";
	}

	@RequestMapping("/adminsignin")
	public String adminSignIn() {
		return "adminSignIn.jsp";
	}

	@RequestMapping("/viewseller")
	public String viewSeller() {
		return "showseller.jsp";
	}

	@RequestMapping("/viewcustomer")
	public String viewCustomer() {
		return "adminviewcustomer.jsp";
	}

	@RequestMapping("/deletecustomer")
	public String deleteCustomer() {
		return "customerdelete.jsp";
	}

}