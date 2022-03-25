package com.mobile.dao;

import org.springframework.data.repository.CrudRepository;

import com.mobile.entity.Mobile;

public interface MobileDao extends CrudRepository<Mobile, Integer> {
	/*
	 * Extending predefined java class "CrudRepository" which contains basic CRUD
	 * operations which are : 
	 * C - Create 
	 * R - Read 
	 * U - Update 
	 * D - Delete
	 */
}
