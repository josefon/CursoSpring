package com.udemy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.udemy.model.Person;
import com.udemy.service.SampleService;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {

	@Override
	public List<Person> getListPeople() {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Jon", 23));
		people.add(new Person("Mikel", 30));
		people.add(new Person("Eva", 41));
		people.add(new Person("Peter", 18));
		return people;
	}

}
