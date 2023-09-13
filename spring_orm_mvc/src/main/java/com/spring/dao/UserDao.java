package com.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entity.UserEntity;

@Repository
public class UserDao {
	
	@Autowired
	public HibernateTemplate hibernateTemplate;
	
	public void saveUser(UserEntity user) {
		 hibernateTemplate.save(user);
		}
	

}
