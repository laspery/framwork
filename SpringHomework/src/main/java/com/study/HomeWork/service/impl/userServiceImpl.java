package com.study.HomeWork.service.impl;


import com.study.HomeWork.bean.user;
import com.study.HomeWork.daos.userDao;
import com.study.HomeWork.service.userService;

public class userServiceImpl   implements  userService{

	
	
	private  userDao dao;
	public void addUser(user us) throws Exception {
		// TODO Auto-generated method stub
		dao.addUser(us);
		
		
	}

	public userServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public userServiceImpl(userDao dao) {
		super();
		this.dao = dao;
	}

	public void deleteUser(user us) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteUser(us);
	}

	public void checkUser(user us) throws Exception {
		// TODO Auto-generated method stub
		dao.checkUser(us);
	}

	public void modifyUser(user us) throws Exception {
		// TODO Auto-generated method stub
		dao.modifyUser(us);
	}

}
