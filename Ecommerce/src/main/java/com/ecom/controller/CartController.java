package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@RequestMapping("/placeorder")
	public String placeOrder(int id) {
		Product product= productDao.findById(id).get();
		 Cart c = new Cart();
		 c.setOid(product.getPid());
		 c.setOname(product.getPname());
		 c.setOprice(product.getPprice());
		 c.setOcategory(product.getPcategory());
		 cartDao.save(c);
		 return null;
	}
}
