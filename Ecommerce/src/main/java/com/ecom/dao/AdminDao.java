package com.ecom.dao;

import org.springframework.data.repository.CrudRepository;

import com.ecom.entity.Admin;

public interface AdminDao extends CrudRepository<Admin, Integer> {}