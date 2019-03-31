package com.ttn.springboot.Controller;

import com.ttn.springboot.Entity.Student;
import com.ttn.springboot.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    
    @Autowired
    StudentService studentService;
    
    @GetMapping("/addStudent")
    @ResponseBody
    public String addStudent(Student student){
        studentService.addStudent(new Student(1,"Arpit", 24));
        studentService.addStudent(new Student(2,"Gagan", 24));
        return "Student Added";
    }
    
    @GetMapping("/getStudent")
    @ResponseBody
    public List<Student> getStudentsList(){
        return studentService.getStudents();
    }
}
