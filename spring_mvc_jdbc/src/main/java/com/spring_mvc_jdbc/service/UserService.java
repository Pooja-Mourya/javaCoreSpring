package com.spring_mvc_jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring_mvc_jdbc.entity.UserEntity;


public interface UserService {


	public int registerUser(UserEntity user);

}
