package com.ecom.service;

import com.ecom.entity.Seller;

public interface SellerService {
	Seller addSeller(Seller seller);
	Seller updateSeller(Seller seller);
	void deleteSeller(int Sid);
}
