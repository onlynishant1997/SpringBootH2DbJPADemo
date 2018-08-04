package com.example.H2Demos.Models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {
	@Id
	@GeneratedValue
	private Long id;
	String fname;
	String lname;
	
	@OneToMany(mappedBy="author",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	List<Post> posts;
	
	public Author() {
		// TODO Auto-generated constructor stub
	}
	
	public Author(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
	
}
