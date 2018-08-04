package com.example.H2Demos.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.H2Demos.Models.Author;

public interface AuthorRepo extends CrudRepository<Author, Long>{

}
