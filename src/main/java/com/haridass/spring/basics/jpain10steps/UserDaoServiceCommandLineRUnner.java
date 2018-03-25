package com.haridass.spring.basics.jpain10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.haridass.spring.basics.jpain10steps.entity.User;
import com.haridass.spring.basics.jpain10steps.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRUnner implements CommandLineRunner{
	
	private static final Logger log = 
			LoggerFactory.getLogger(UserDaoServiceCommandLineRUnner.class);
	
	
	
	@Autowired
	private UserDAOService userDaoService;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack","Admin");
		long insert = userDaoService.insert(user);
		log.info("New User is created : " + user);
	}

}
