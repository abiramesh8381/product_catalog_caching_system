package com.product.staple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@EnableCaching
public class StapleApplication {

	public static void main(String[] args) {
		SpringApplication.run(StapleApplication.class, args);
	}

}
