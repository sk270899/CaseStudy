package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecom.dao.SellerDao;
import com.ecom.entity.Seller;

@Controller
public class SellerController {
	
	@Autowired
	SellerDao sellerdao;
	
	@RequestMapping("/addingSeller")
	public String addingSeller(Seller s) {	
		sellerdao.save(s);
		return "sellersignin.jsp";
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