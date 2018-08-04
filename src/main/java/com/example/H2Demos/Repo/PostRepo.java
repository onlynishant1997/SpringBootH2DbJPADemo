package com.example.H2Demos.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.H2Demos.Models.Post;

public interface PostRepo extends CrudRepository<Post, Long>{
	
}
