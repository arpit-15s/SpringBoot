package com.springrest.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;


@RestController
public class Controller {

    // @Autowired
    // Course course;

    List<Course> courses = new ArrayList<>();
    
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return courses;
    }

    
    
}
