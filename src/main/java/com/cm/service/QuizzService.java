package com.cm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cm.model.Quizz;
import com.cm.model.QuizzDto;
import com.cm.repository.UserRepository;

@Service
public class QuizzService {
    String sub1="sports";
    String sub2="general";
    String sub3="history";
    String sub4="animals";
    String sub5="geography";
    String sub6="film";
    
    @Autowired
	private UserRepository userDao;
    
    
     QuizzJson qj =new QuizzJson();

    
	public String quizz(String type) {
		System.out.println("in service");
		if(type.equals(sub1)) {
		String url="https://opentdb.com/api.php?amount=10&category=21&difficulty=medium&type=multiple";
		RestTemplate restTemplate = new RestTemplate();
		String resp = restTemplate.getForObject(url, String.class);
		System.out.println(resp);
		return resp;
	                    }  
		else if (type.equals(sub2)) {
			String url="https://opentdb.com/api.php?amount=10&category=9&difficulty=medium&type=multiple";
			RestTemplate restTemplate = new RestTemplate();
			String resp = restTemplate.getForObject(url, String.class);
			System.out.println(resp);
			return resp;
		}
		
        else if (type.equals(sub3)) {
        	String url="https://opentdb.com/api.php?amount=10&category=23&difficulty=medium&type=multiple";
    		RestTemplate restTemplate = new RestTemplate();
    		String resp = restTemplate.getForObject(url, String.class);
    		System.out.println(resp);
    		return resp;
		}
		
        else if (type.equals(sub4)) {
        	String url="https://opentdb.com/api.php?amount=10&category=27&difficulty=medium&type=multiple";
    		RestTemplate restTemplate = new RestTemplate();
    		String resp = restTemplate.getForObject(url, String.class);
    		System.out.println(resp);
    		return resp;
        }
        else if (type.equals(sub5)) {
        	String url="https://opentdb.com/api.php?amount=10&category=22&difficulty=medium&type=multiple";
    		RestTemplate restTemplate = new RestTemplate();
    		String resp = restTemplate.getForObject(url, String.class);
    		System.out.println(resp);
    		return resp;
        }
        else if (type.equals(sub6)) {
        	String url="https://opentdb.com/api.php?amount=10&category=11&difficulty=medium&type=multiple";
    		RestTemplate restTemplate = new RestTemplate();
    		String resp = restTemplate.getForObject(url, String.class);
    		System.out.println(resp);
    		return resp;
        }
		
		else {
			return "not available";
		}
//        return "jjj";
}


	public QuizzJson getdata(QuizzDto q) {
		Quizz quizz=new Quizz();
		quizz.setQuizzType(q.getQuizzType());
		quizz.setTotalQuestions(q.getTotalQuestions());
		quizz.setTotalRights(q.getTotalRights());
		quizz.setTotalWrongs(q.getTotalWrongs());
		quizz.setTimeTaken(q.getTimeTaken());
		qj.setStatus("success");
		userDao.save(quizz);
		return qj;
	}
}