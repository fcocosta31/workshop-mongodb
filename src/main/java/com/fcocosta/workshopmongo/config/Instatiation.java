package com.fcocosta.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.fcocosta.workshopmongo.domain.User;
import com.fcocosta.workshopmongo.repository.UserRepository;

@Configuration
public class Instatiation implements CommandLineRunner{

	@Autowired
	private UserRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repo.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com"); 
		User alex = new User(null, "Alex Green", "alex@gmail.com"); 
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		repo.saveAll(Arrays.asList(maria, alex, bob));
		
	}

}
