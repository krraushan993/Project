package com.animal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.animal.entity.Animal;

@Repository
public interface AnimalRepo extends JpaRepository<Animal,Integer>{

}
