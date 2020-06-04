package com.cm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.model.UserDao;
import com.cm.repository.UserRepository;

@Service
public class ProfileService {

	@Autowired
	UserRepository ur;
	
	public UserDao viewProfile(String name) {
//		System.out.println(name);
		System.out.println(ur.findAll());
		return ur.findByUsername(name);
	}

	public List<String> users() {
		System.out.println("mishra");
		List<String> list=ur.findAllUsername();
		return list;
	}
	
	
	
	
//	public Iterable<UserDao> viewProfile() {
////		System.out.println(name);
////		System.out.println(ur.findAll());
//		return ur.findAll();
//	}

}
