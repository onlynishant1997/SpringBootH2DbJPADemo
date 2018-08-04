package com.example.H2Demos;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.H2Demos.Models.Post;
import com.example.H2Demos.Repo.PostRepo;
import com.example.H2Demos.Service.DataLoader;


@SpringBootApplication
public class H2DemosApplication {
	@Autowired
	PostRepo pr;
	
	@Autowired
	DataLoader dl;

	public static void main(String[] args) {
		SpringApplication.run(H2DemosApplication.class, args);
	}
	
	@PostConstruct
	void seePosts() {
		Logger l=Logger.getLogger(H2DemosApplication.class.getName());
		l.info("seePost called....");
		for(Post i:pr.findAll()) {
			l.info(i.toString()); 
		 }
	}
}
