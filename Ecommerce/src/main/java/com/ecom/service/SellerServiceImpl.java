package com.ecom.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.dao.SellerDao;
import com.ecom.entity.Seller;

@Service
@Transactional
public class SellerServiceImpl implements SellerService{

	@Autowired
	SellerDao sellerDao;

	@Override
	public Seller addSeller(Seller seller) {
		return sellerDao.save(seller);
	}

	@Override
	public Seller updateSeller(Seller seller) {
		return sellerDao.save(seller);
	}

	@Override
	public void deleteSeller(int Sid) {
		sellerDao.deleteById(Sid);
	}
	
}
