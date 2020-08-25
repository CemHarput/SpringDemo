package com.example.demo.repo;

import com.example.demo.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepo extends CrudRepository<Person, UUID> {


    public Person findFirstByGrade(double grade);


}
