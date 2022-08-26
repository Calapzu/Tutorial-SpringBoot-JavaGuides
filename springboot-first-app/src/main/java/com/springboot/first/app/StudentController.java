package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Yamson", "Calapzu");
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Yamson", "Calapzu"));
        students.add(new Student("Jhoan", "Palma"));
        students.add(new Student("Yamson", "Palma"));
        students.add(new Student("Jhoan", "Calapzu"));
        students.add(new Student("Yamson", "Jhoan"));
        return students;
    }
}
