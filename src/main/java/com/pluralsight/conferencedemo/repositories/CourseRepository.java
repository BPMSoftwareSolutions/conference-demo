package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
