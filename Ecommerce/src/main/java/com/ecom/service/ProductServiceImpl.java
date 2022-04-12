package com.ecom.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.dao.ProductDao;
import com.ecom.entity.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	
	@Override
	public Product addProduct(Product product) {
		return productDao.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return productDao.save(product);
	}

	@Override
	public void deleteProduct(int Pid) {
		productDao.deleteById(Pid);;
	}

}
