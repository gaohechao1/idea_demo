package com.example.demo.dao;

import com.example.demo.dto.PersonDto;

import java.util.HashMap;

public interface PersonDao {

    int addPerson(PersonDto personDto);

    PersonDto getPersonById(Integer id);

    int updatePerson(HashMap<String,Object> params);

}
