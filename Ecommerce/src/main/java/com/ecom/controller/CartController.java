package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecom.dao.CartDao;
import com.ecom.dao.ProductDao;
import com.ecom.entity.Cart;
import com.ecom.entity.Product;

@Controller
public class CartController {

	@Autowired
	CartDao cartDao;
	
	@Autowired
	ProductDao productDao;

	// NON FUNCTIONAL UNIT
	
	@RequestMapping("/placeorder")
	public String placeOrder(@RequestParam int Pid) {
		System.out.println("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiid=       "+Pid);
		Product product= productDao.findById(Pid).get();
		 Cart c = new Cart();
		 c.setOid(product.getPid());
		 c.setOname(product.getPname());
		 c.setOprice(product.getPprice());
		 c.setOcategory(product.getPcategory());
		 cartDao.save(c);
		 return "placeorder.jsp";
	}
}
