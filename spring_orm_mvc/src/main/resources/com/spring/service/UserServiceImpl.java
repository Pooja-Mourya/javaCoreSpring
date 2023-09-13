package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;
import com.spring.entity.UserEntity;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userdao;
	
	public void saveMyUser(UserEntity user) {
		// TODO Auto-generated method stub
		userdao.saveUser(user);
		
	}

}
