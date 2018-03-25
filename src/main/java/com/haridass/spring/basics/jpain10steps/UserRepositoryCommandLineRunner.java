package com.haridass.spring.basics.jpain10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.haridass.spring.basics.jpain10steps.entity.User;
import com.haridass.spring.basics.jpain10steps.service.UserDAOService;
import com.haridass.spring.basics.jpain10steps.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log = 
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	
	
	@Autowired
	private UserRepository userDaoService;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jill","Admin");
		userDaoService.save(user);
		log.info("New User is created : " + user);
	}

}
