package com.example.demo.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class PersonRepositoryImpl implements PersonRepository{

	@Override
	@Cacheable("persons")
	public Person getDetails(String name) {
		delay();
		return new Person(name, " Any Person");
	}
	
	public void delay()
	{
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
