package com.cm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cm.model.Quizz;
import com.cm.model.QuizzDto;
import com.cm.service.QuizzJson;
import com.cm.service.QuizzService;

@RestController
public class QuizzController {
	@Autowired
	private QuizzService QuizzService;
	
	@CrossOrigin(origins = "*")
	@RequestMapping("/quizz/{type}")
	public String quizz(@PathVariable String type) {
		System.out.println(type);
		return QuizzService.quizz(type);
	}

	
	@CrossOrigin(origins = "*")
	@RequestMapping(method = RequestMethod.POST,value = "/quizdata")
	public QuizzJson getdata(@RequestBody QuizzDto quizzDto) {
		return QuizzService.getdata(quizzDto);
	}
	
}
