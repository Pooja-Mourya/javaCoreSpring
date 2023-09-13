package com.spring_mvc_jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.spring_mvc_jdbc.dao.UserDao;
import com.spring_mvc_jdbc.entity.UserEntity;

@Service
@Controller
public  class UserSrviceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public int registerUser(UserEntity user) {
		// TODO Auto-generated method stub
		int i = userDao.saveUser(user);
		return i;
	}

	
}
