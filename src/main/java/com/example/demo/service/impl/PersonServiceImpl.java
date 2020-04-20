package com.example.demo.service.impl;

import com.example.demo.dao.PersonDao;
import com.example.demo.dto.PersonDto;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDao personDao;

    @Override
    public int addPerson(PersonDto personDto) {
        return personDao.addPerson(personDto);
    }

    @Override
    public PersonDto getPersonById(Integer id) {
        return personDao.getPersonById(id);
    }

    @Override
    public int updatePerson(HashMap<String,Object> params) {
        int i = personDao.updatePerson(params);
        int k = 1/0;
        return i;
    }
}
