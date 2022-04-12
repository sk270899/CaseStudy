package com.ecom.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecom.dao.SellerDao;
import com.ecom.entity.Seller;

@Controller
public class SellerController {
	
	@Autowired
	SellerDao sellerdao;
	
	String driverName = "org.postgresql.Driver";
	String connectionUrl = "jdbc:postgresql://localhost/";
	String dbName = "student";
	String userId = "postgres";
	String password = "postgres";
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	
	@RequestMapping("/addingSeller")
	public String addingSeller(Seller s) throws ClassNotFoundException, SQLException {	
		String Semail = s.getSemail();
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class.forName("org.postgresql.Driver");
		connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
		statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		// System.out.println(name);
		resultSet = statement.executeQuery("select * from Seller where Semail=" + "'" + Semail + "'");
		resultSet.last();
		// System.out.println(resultSet.getRow());
		if (resultSet.getRow() > 0) {
			System.out.println(Semail + "--> e-mail already exists");
			return "selleradd.jsp";
			// emailalredyexists.jsp
		} else {
			sellerdao.save(s);
			return "sellersignin.jsp";
		}
	}
	
	@RequestMapping("/updatingSeller")
	public String updatingSeller(Seller s) {	
		sellerdao.save(s);
		return "sellerdisplay.jsp";
	}
	
	@RequestMapping("/deletingSeller")
	public String deletingSeller(int id) {	
		sellerdao.deleteById(id);
		return "admincontrol.jsp";
	}
	
	@RequestMapping("/seller")
	public String seller() {
		return "sellerloginsignup.jsp";
	}

	@RequestMapping("/sellersignup")
	public String sellerSignUp() {
		return "selleradd.jsp";
	}

	@RequestMapping("/sellersignin")
	public String sellerSignIn() {
		return "sellersignin.jsp";
	}

	@RequestMapping("/addseller")
	public String addSeller() {
		return "selleradd.jsp";
	}

	@RequestMapping("/adminseller")
	public String adminSeller() {
		return "admincontrol.jsp";
	}

	@RequestMapping("/updateseller")
	public String updateSeller() {
		return "sellerupdate.jsp";
	}

	@RequestMapping("/sellerafterlogin")
	public String sellerAfterLogin() {
		return "sellerdisplay.jsp";
	}

	// DELETE SELLER //
	@RequestMapping("/deleteseller")
	public String deleteSeller() {
		return "sellerdelete.jsp";
	}

	@RequestMapping("/sellerproductshow")
	public String sellerProductShow() {
		return "sellerlistedproducts.jsp";
	}

	@RequestMapping("/sellergobacktohome")
	public String sellerGoBackToHome() {
		return "Home.jsp";
	}

}