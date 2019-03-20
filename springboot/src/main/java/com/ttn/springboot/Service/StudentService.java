package com.ttn.springboot.Service;

import com.ttn.springboot.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class StudentService {
    List<Student> students = new LinkedList<>();
    
    public void addStudent(Student student){
        students.add(student);
    }
    
    public List<Student> getStudents(){
        return students;
    }
}
