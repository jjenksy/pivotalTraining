package com.jjenksydemo;

import com.jjenksydemo.ctrl.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoJjenksyApplication {


	final private PersonProperties personProperties;

	@Autowired
	public SpringDemoJjenksyApplication(PersonProperties personProperties){
		this.personProperties = personProperties;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoJjenksyApplication.class, args);
	}


}
