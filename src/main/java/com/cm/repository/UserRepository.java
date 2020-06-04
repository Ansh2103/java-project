package com.cm.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cm.model.Quizz;
import com.cm.model.UserDao;
public interface UserRepository extends CrudRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
    
    List< UserDao> findByUsernameAndPassword(String username,String password);
	List< UserDao> findByEmail(String Email);
	void deleteByUsername(String username);
//	UserDao findByUsername();
	
    @Query(value="SELECT id,username,email FROM user",nativeQuery = true)
    List<String> findAllUsername();

	List<Quizz> save(Quizz quizz);
	}