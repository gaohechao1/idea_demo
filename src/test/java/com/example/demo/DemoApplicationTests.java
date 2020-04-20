package com.example.demo;

import com.example.demo.dto.PersonDto;
import com.example.demo.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest

class DemoApplicationTests {

	@Autowired
	PersonService personService;
	@Autowired
	RedisTemplate redisTemplate;


	@Test
	void contextLoads() {
	}

	@Test
	public void testGetPersonById(){
		PersonDto personDto = personService.getPersonById(1);
		System.out.println(personDto);

	}

	@Test
	public void  testUpdatePerson(){ // aop事务
		HashMap<String,Object> params = new HashMap<String, Object>();
		params.put("id",1);
		params.put("name","abcdf");
		personService.updatePerson(params);
	}
	@Test
	public  void testRedisAdd(){
		redisTemplate.opsForValue().set("name","高何朝");
	}
	@Test
	public  void testGetRedisValue(){
		Object name = redisTemplate.opsForValue().get("name");
		System.out.print("得到redis的值：" + name);
	}

}
