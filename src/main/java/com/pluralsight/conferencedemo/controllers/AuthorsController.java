package com.pluralsight.conferencedemo.controllers;

import com.pluralsight.conferencedemo.models.Author;
import com.pluralsight.conferencedemo.models.Course;
import com.pluralsight.conferencedemo.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("api/v1/authors")
public class AuthorsController {
    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping
    public List<Author> list() { return authorRepository.findAll(); }

    @GetMapping
    @RequestMapping("{id}")
    public Author get(@PathVariable Long id) {
        return authorRepository.getById(id);
    }

    @GetMapping
    @RequestMapping("courses/{id}")
    public Set<Course> getCoursesByAuthor(@PathVariable Long id) {
        return authorRepository.getById(id).getCourses();
    }
}
