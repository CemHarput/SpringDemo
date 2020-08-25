package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);

    }
   @GetMapping
    public List<Person> getAllPeople(){
        return personService.getAllPeople();

    }
    @GetMapping("/filter/{name}")
    public List<Person> filter(@PathVariable String name){

        return personService.filter(name);
    }
    @GetMapping("/filter/{School}")
    public List<Person> filterBySchool(@PathVariable String School){

        return personService.filterBySchool(School);
    }

    @GetMapping("/filter/{grade}")
    public Person filterByGrade(@PathVariable double grade){

        return personService.filterByGrade(grade);
    }

}
