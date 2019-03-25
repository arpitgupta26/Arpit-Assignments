package com.ttn.Repository;

import com.ttn.Entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,Integer> {
    
    //Answer 4
    Person findByFirstName(String firstName);
    
    Person findByLastName(String lastName);
    
    Person findById(Integer id);
    
    //Answer 6
    @Query("select firstName from Person where age=:age")
    List<Person> findFirstNameByAge(@Param("age")Integer age);
    
    //Answer 7
    @Query("select firstName,lastName from Person where age=:age")
    List<Object[]> findFirstAndLastNameByAge(@Param("age")Integer age);
    
    //Answer 8
    @Query("select p from Person p where age=:age")
    List<Person> getPersonByAge(@Param("age")Integer age);
    
    //Answer 9
    @Query("select count(p) from Person p where firstName=:firstName")
    Integer countPersonByFirstName(@Param("firstName")String firstname);
    
    //Answer 10
    List<Person> countByFirstName(String firstName);
    
    List<Person> findByIdOrFirstName(Integer id, String firstName);
    
    List<Person> findByAgeAndSalary(Integer age, Integer salary);
    
    List<Person> findBySalaryBetween(Integer minSalary, Integer maxSalary);
    
    List<Person> findByAgeLessThan(Integer age);
    
    List<Person> findBySalaryGreaterThan(Integer salary);
    
    List<Person> findByFirstNameLike(String firstName);
    
    List<Person> findBySalaryNot(Integer salary);
    
    List<Person> findByAgeIn(List<Integer> age);
    
    List<Person> findByFirstNameIgnoreCase(String firstName);
    
    // Answer 11
    List<Person> findByAgeGreaterThanOrderByIdDesc(Integer age);
    
    //Answer 12
    List<Person> findByAgeGreaterThan(Integer age, Sort sort);
    
    //Answer 13
    Page<Person> findAll(Pageable pageable);
}
