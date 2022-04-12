package com.ecom.dao;

import org.springframework.data.repository.CrudRepository;

import com.ecom.entity.Product;

public interface ProductDao extends CrudRepository<Product, Integer> {}
