package com.pluralsight.conferencedemo.controllers;

import com.pluralsight.conferencedemo.models.Author;
import com.pluralsight.conferencedemo.models.Course;
import com.pluralsight.conferencedemo.repositories.AuthorRepository;
import com.pluralsight.conferencedemo.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/courses")
public class CoursesController {
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public List<Course> get() { return courseRepository.findAll(); }

    @GetMapping
    @RequestMapping("{id}")
    public Course get(@PathVariable Long id) { return courseRepository.getById(id); }
}
