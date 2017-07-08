package com.phearun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.phearun.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByUsername(String username);
	User findByStatus(boolean status);
	User findByAddressZipCode(String zipCode);
	User findByAddressCity(String city);
	
	@Query("select count(*) from user")
	Integer countUser();
	
}
