package com.example.demo.service;

import com.example.demo.dto.PersonDto;

import java.util.HashMap;

public interface PersonService {
    int addPerson(PersonDto personDto);

    PersonDto getPersonById(Integer id);

    int updatePerson(HashMap<String,Object> params);
}
