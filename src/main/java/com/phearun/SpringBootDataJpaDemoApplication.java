package com.phearun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.phearun.entity.User;
import com.phearun.repository.UserRepository;

@SpringBootApplication
public class SpringBootDataJpaDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDataJpaDemoApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		userRepository.save(new User(0, "dara", "123", true));
		userRepository.save(new User(0, "bopha", "123", true));
		userRepository.save(new User(0, "nary", "123", false));
		userRepository.save(new User(0, "dareth", "123", true));
		
		System.out.println(userRepository.findAll());
	}
}
