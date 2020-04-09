package com.hemant.mart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.hemant.mart.repository.ICustomerRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = ICustomerRepository.class )
public class MartApplication {

	public static void main(String[] args) {
		SpringApplication.run(MartApplication.class, args);
	}

}
