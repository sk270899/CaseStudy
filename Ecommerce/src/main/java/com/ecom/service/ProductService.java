package com.ecom.service;

import com.ecom.entity.Product;

public interface ProductService {
	Product addProduct(Product product);
	Product updateProduct(Product product);
	void deleteProduct(int Pid);
}
