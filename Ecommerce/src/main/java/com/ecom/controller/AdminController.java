package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecom.dao.AdminDao;
import com.ecom.entity.Admin;

@Controller
public class AdminController {
	@Autowired
	AdminDao admindao;
	
	@RequestMapping("/addingAdmin")
	public String addingAdmin(Admin a) {	
		admindao.save(a);
		return "adminSignIn.jsp";
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