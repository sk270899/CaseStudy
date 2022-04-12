package com.ecom.service;

import com.ecom.entity.Customer;

public interface CustomerService {
	Customer addCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	void deleteCustomer(int Cid);
}
