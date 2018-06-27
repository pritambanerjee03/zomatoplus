package com.thinkxfactor.zomztoplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
		
	User findByUsernameAndPassword(String name,String Password);
}
