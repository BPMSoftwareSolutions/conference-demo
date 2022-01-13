package com.pluralsight.conferencedemo.controllers;

import com.pluralsight.conferencedemo.models.Author;
import com.pluralsight.conferencedemo.models.Course;
import com.pluralsight.conferencedemo.repositories.AuthorRepository;
import com.pluralsight.conferencedemo.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
