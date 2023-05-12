package com.animal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.animal.entity.Animal;
import com.animal.repository.AnimalRepo;


@Service
public class AnimalService {

	@Autowired
	private AnimalRepo repo;
	public List<Animal> getAllAnm(){
		return repo.findAll();
	}
}
