package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.example.demo.cache.PersonRepository;

@EnableCaching
@SpringBootApplication

public class SpringBootDataCacheApplication implements CommandLineRunner {
	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataCacheApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i <= 100000; i++) {
			System.out.println("Cache test" + i);
		}

	}
}
