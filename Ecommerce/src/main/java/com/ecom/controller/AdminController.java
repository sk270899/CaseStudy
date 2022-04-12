package com.ecom.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecom.dao.AdminDao;
import com.ecom.entity.Admin;

@Controller
public class AdminController {
	@Autowired
	AdminDao admindao;
	
	String driverName = "org.postgresql.Driver";
	String connectionUrl = "jdbc:postgresql://localhost/";
	String dbName = "student";
	String userId = "postgres";
	String password = "postgres";
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
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
		if (resultSet.getRow() > 0 || Apassword.length()<8) {
			if(resultSet.getRow() > 0) {
				System.out.println(Aemail + "--> e-mail already exists");
				return "adminadd.jsp";
			} else if(Apassword.length()<8) {
				System.out.println("--> password must be 8 characters");
				return "adminadd.jsp";
			}
			return "adminadd.jsp";
			// emailalredyexists.jsp
		} else {
			admindao.save(a);
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