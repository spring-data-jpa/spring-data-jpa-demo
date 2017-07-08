package com.phearun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phearun.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUsername(String username);
}
