package com.example.demo;

import com.example.demo.service.PersonService;
import javafx.application.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
 * 打包用123
@SpringBootApplication
@RestController
@MapperScan("com.example.demo.dao")
@EnableTransactionManagement
@EnableScheduling
public class DemoApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(WebApplicationType.SERVLET).run(args);
	}
	@Autowired
	PersonService personService;
	@GetMapping("/getPersonById")
	public String getPersonById(){
		personService.getPersonById(1);
		return  "hello word";
	}
}
*/

@SpringBootApplication
@RestController
@MapperScan("com.example.demo.dao")
@EnableTransactionManagement
@EnableScheduling
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Autowired
	PersonService personService;
	@GetMapping("/getPersonById")
	public String getPersonById(){
		personService.getPersonById(1);
		return  "hello word";
	}
}
