package com.ttn;


import com.ttn.Entity.Person;
import com.ttn.Repository.PersonRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(PersistenceContext.class);
        Person person = new Person();
        person.setFirstName("Arpit");
        person.setLastName("Gupta");
        person.setAge(24);
        person.setSalary(20000);
        PersonRepository personRepository = applicationContext.getBean(PersonRepository.class);
        //Create
//        personRepository.save(person);personRepository.findOne(1);
        //Read
        System.out.println();
        //Update
        person.setSalary(40000);
//        personRepository.save(person);
        //Read
        System.out.println(personRepository.findOne(1));
        //Delete
//        personRepository.delete(1);
        System.out.println(personRepository.findByFirstName("Gagan"));
        System.out.println(personRepository.findByLastName("Kushwaha"));
        System.out.println(personRepository.findById(3));
        System.out.println(personRepository.findFirstNameByAge(24));
        personRepository.findFirstAndLastNameByAge(24).forEach(e-> System.out.println(Arrays.asList(e)));
    
        System.out.println(personRepository.getPersonByAge(24));
    
        System.out.println(personRepository.countPersonByFirstName("Arpit"));
    
        System.out.println(personRepository.findByFirstNameIgnoreCase("arpit"));
        System.out.println(personRepository.findBySalaryNot(50000));
        System.out.println(personRepository.findByIdOrFirstName(1,"Gagan"));
    
        System.out.println(personRepository.findByAgeGreaterThanOrderByIdDesc(23));
        System.out.println(personRepository.
                findByAgeGreaterThan(24,new Sort(Sort.Direction.DESC,"id")));
    
        System.out.println(personRepository.findAll(new PageRequest(1,2)).getContent());
    }
}
