package com.hexaware.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springcore.dao.IDao;

@Service
public class ServiceImpl implements IService {
	
	@Autowired
	IDao dao;

	@Override
	public void getService() {
		// TODO Auto-generated method stub
		System.out.println("Service Excecuted");
		System.out.println("Service got DAO object"+ dao);
		dao.getDao();

	}

}
