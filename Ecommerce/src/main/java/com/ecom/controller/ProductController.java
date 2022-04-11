package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecom.dao.ProductDao;
import com.ecom.entity.Product;

@Controller
public class ProductController {

	@Autowired
	ProductDao productdao;

	@RequestMapping("/")
	public String home() {
		return "Home.jsp";
	}

	@RequestMapping("/addProduct")
	public String addProduct(Product p) {
		productdao.save(p);
		return "productdisplay.jsp";
	}

	@RequestMapping("/updateProduct")
	public String updateProduct(Product p) {
		productdao.save(p);
		return "productdisplay.jsp";
	}

	@RequestMapping("/deleteProduct")
	public String deleteProduct(int id) {
		productdao.deleteById(id);
		return "productdisplay.jsp";
	}

	@RequestMapping("/add")
	public String add() {
		return "productadd.jsp";
	}

	@RequestMapping("/update")
	public String update() {
		return "productupdate.jsp";
	}

	@RequestMapping("/delete")
	public String delete() {
		return "productdelete.jsp";
	}
}