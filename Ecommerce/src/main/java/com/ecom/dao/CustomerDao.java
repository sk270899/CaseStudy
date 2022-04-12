package com.ecom.dao;

import org.springframework.data.repository.CrudRepository;

import com.ecom.entity.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer> {}
