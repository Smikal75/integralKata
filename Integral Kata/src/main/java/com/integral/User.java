package com.integral;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String username;
	private List<Post> repository = new ArrayList<Post>();
	
	public User(String username) {
		this.username=username;
	}

	public String getUsername() {
		return username;
	}

	public List<Post> getRepository() {
		
		return repository;
	}

	public void createPost(String content) {
		Post newPost = new Post(username);
		newPost.setPost(content);
		this.repository.add(newPost);
		
	}

}
