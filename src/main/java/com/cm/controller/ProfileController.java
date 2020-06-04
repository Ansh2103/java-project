package com.cm.controller;

import java.awt.print.Pageable;
import java.lang.reflect.Method;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cm.model.UserDao;
import com.cm.repository.UserRepository;
import com.cm.service.ProfileService;
import com.fasterxml.jackson.annotation.JacksonInject.Value;
@Transactional
@RestController
public class ProfileController {
	@Autowired
	private ProfileService pr;
	
	@Autowired
	UserRepository ur;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/profile/{name}" , method = RequestMethod.GET)
	public UserDao viewProfile(@PathVariable String name){
		
			return pr.viewProfile(name) ;
	}
	
//	@CrossOrigin(origins = "*")
//	@RequestMapping(value="/profile" , method = RequestMethod.GET)
//	public Iterable<UserDao> viewProfile1(){
//		
//			return pr.viewProfile() ;
//	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value="/users")
	public List<String> viewProfile(){
//		System.out.println("chandan");
	return pr.users();
//		
   }
	
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/userall" , method = RequestMethod.GET)
	public Iterable<UserDao> viewuser(){
		
			return ur.findAll();
	}
	
	@CrossOrigin(origins ="*")
	@RequestMapping(value = "/delete/{name}",method = RequestMethod.DELETE)
	public void delete(@PathVariable String name) {
		ur.deleteByUsername(name);
	}
	
	
}
