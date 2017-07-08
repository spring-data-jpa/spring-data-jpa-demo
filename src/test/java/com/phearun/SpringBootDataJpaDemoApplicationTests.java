package com.phearun;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.phearun.entity.User;
import com.phearun.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDataJpaDemoApplicationTests {
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void contextLoads() {
		
		userRepository.save(new User(0, "dara", "123", true));
		userRepository.save(new User(0, "bopha", "123", true));
		userRepository.save(new User(0, "nary", "123", false));
		userRepository.save(new User(0, "dareth", "123", true));
		
		userRepository.findAll().forEach(System.out::println);;
		System.out.println(userRepository.findByUsername("dara"));
	}

}
