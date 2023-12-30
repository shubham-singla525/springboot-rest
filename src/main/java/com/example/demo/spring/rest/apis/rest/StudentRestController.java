package com.example.demo.spring.rest.apis.rest;

import com.example.demo.spring.rest.apis.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> listOfStudents;

    @PostConstruct
    public void loadData(){
        listOfStudents = new ArrayList<>();

        listOfStudents.add(new Student("Shubham","Singla"));
        listOfStudents.add(new Student("Rahul","Sharma"));
        listOfStudents.add(new Student("Mohan","Raya"));

    }



    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        //data retrieval code is pending(refactor it later)--  Keep it simple

        if(studentId>=listOfStudents.size()||studentId<0){
            throw new StudentNotFoundException("Student not found for id "+studentId);
        }

        return listOfStudents.get(studentId);

    }

    @GetMapping("/students")
    public List<Student> getStudents(){

        return listOfStudents;
    }




}
