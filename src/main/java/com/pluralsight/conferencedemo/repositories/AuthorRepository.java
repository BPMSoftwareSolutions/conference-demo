package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
