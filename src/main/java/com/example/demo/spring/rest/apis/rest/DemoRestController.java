package com.example.demo.spring.rest.apis.rest;

import com.example.demo.spring.rest.apis.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class DemoRestController {


    // creating endpoint for populating hello world!
    @GetMapping("/hello")
    public String getHelloWorld(){
        return "Hello, World!!";
    }



}
