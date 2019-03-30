package com.springboot.demo.thymeleaf;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

  public List<Employee> getEmployeeList() {

    return Arrays.asList(
        new Employee("arpit", "arpit@gmail.com", 24, true),
        new Employee("arpitg", "arpitg@gmail.com", 21, false),
        new Employee("prateek", "prateek@gmail.com", 22, true),
        new Employee("lohit", "lohit@gmail.com", 23, false));
  }

  public Employee getEmployee() {
    return new Employee("arpit276", "arpit276@gmail.com", 24, true);
  }
}
