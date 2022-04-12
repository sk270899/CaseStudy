package com.ecom.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.dao.AdminDao;
import com.ecom.entity.Admin;

@Service // works same as component annotation
@Transactional 
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminDao adminDao;

	@Override
	public Admin addAdmin(Admin admin) {
		return adminDao.save(admin);
	}
	
	
}
