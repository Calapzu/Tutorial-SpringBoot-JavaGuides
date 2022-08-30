package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    //http://localhost:8080/student/yamson/calapzu
    //@PathVariable annotation
    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentpathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName){
        return new Student(firstName, lastName);
    }

    //Crea una API Rest para manejar los parametros
    //http://localhost:8080/student?firstName=Yamson&lastName=Calapzu
    @GetMapping("/student/query")
    public Student studentQueryParam(@RequestParam(name = "firstName") String firstName,
                                     @RequestParam(name = "lastName") String lastName){
        return new Student(firstName, lastName);
    }
}
