package com.ecom.dao;

import org.springframework.data.repository.CrudRepository;

import com.ecom.entity.Seller;

public interface SellerDao extends CrudRepository<Seller, Integer> {}
