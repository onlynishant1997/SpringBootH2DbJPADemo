package com.example.H2Demos.Service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.H2Demos.Models.Author;
import com.example.H2Demos.Models.Post;
import com.example.H2Demos.Repo.AuthorRepo;
import com.example.H2Demos.Repo.PostRepo;

@Service
public class DataLoader {
	private PostRepo pr;
	private AuthorRepo ar;
	@Autowired
	public DataLoader(PostRepo pr, AuthorRepo ar) {
		this.pr = pr;
		this.ar = ar;
	}
	@PostConstruct
	private void loadData() {
		Author author=new Author("Nishant","Bansal");
		ar.save(author);
		Post post=new Post();
		post.setBody("Spring Data Rocks");
		post.setTitle("Spring Lover");
		post.setDate(new Date());
		post.setAuthor(author);
		pr.save(post);
		
	}
	
}
