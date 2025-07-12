package com.trinetra;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableJpaRepositories("com.trinetra.dao")
public class TrinetraApplication {
	
    public static void main(String[] args) {
    	    
        SpringApplication.run(TrinetraApplication.class, args);
    }

}
