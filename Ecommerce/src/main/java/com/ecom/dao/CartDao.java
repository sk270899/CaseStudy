package com.ecom.dao;

import org.springframework.data.repository.CrudRepository;

import com.ecom.entity.Cart;

public interface CartDao extends CrudRepository<Cart, Integer>{}
