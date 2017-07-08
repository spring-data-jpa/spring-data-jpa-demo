package com.phearun;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.phearun.entity.Address;
import com.phearun.entity.User;
import com.phearun.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SpringBootDataJpaDemoApplicationTests {
	
	@Autowired
	private UserRepository userRepository;
	
	@Test	
	public void o1save() {
		System.out.println("-> Saving User...");
		userRepository.save(new User(0, "dara", "123", true, null, new Address(0, "12000", "Phnom Penh")));
		userRepository.save(new User(0, "bopha", "123", true, null, new Address(0, "11000", "Battambong")));
		userRepository.save(new User(0, "nary", "123", false, null, new Address(0, "13000", "Siem Reap")));
		userRepository.save(new User(0, "dareth", "123", true, null, new Address(0, "10000", "Kandal")));
	}
	
	@Test
	public void o2findAll(){
		System.out.println("-> Find All Users...");
		userRepository.findAll().forEach(System.out::println);
	}
	
	@Test
	public void o3findByUsername(){
		System.out.println("-> Find by username[dara]...");
		User user = userRepository.findByUsername("dara");
		System.out.println(user);
	}
	
	@Test
	public void o4findByAddressZipCode(){
		System.out.println("-> Find by address zipCode[11000]...");
		User user = userRepository.findByAddressZipCode("11000");
		System.out.println(user);
	}
	
	@Test
	public void o5findByAddressCity(){
		System.out.println("-> Find by address city[Phnom Penh]...");
		User user = userRepository.findByAddressCity("Phnom Penh");
		System.out.println(user);
	}
	@Test
	public void o6countUser(){
		System.out.println("-> Count all users...");
		System.out.println("Users: " + userRepository.countUser());
		
	}
//	@Test
//	public void o7findAllUsers(){
//		System.out.println("-> Find all user...");
//		userRepository.findAllUsers().forEach(System.out::println);
//	}
}
