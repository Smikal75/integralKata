package com.integral;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestUser {

	@Test
	public void getUser_method_returns_username() {
		User testUser = new User ("Alice");
		String actual = testUser.getUsername();
		String assertion = "Alice";
		assertTrue(assertion.equals(actual));
		}
	
	@Test
	public void getrepository_method_returns_an_empty_list() {
		User testUser = new User ("Alice");
		List<Post> actual = testUser.getRepository();
		assertTrue(actual.isEmpty());
		}
	
	@Test
	public void createpost_method_adds_post_to_repository() {
		User testUser = new User ("Alice");
		testUser.createPost("I love the weather today.");
		Post actual = testUser.getRepository().get(0);
		Post assertion = new Post ("Alice");
		assertion.setPost("I love the weather today.");
		assertTrue(assertion.equals(actual));
		}
	

	
	
}
