package com.study.HomeWork.daos;

import com.study.HomeWork.bean.user;

public interface userDao {

public void addUser(user us) throws Exception;
	
public void deleteUser(user us) throws Exception;
	
public void checkUser(user us) throws Exception;

public void modifyUser(user us) throws Exception;


}
