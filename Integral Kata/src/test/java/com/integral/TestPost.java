package com.integral;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class TestPost {

	@Test
	public void getuser_method_returns_a_user_username() {
		Post testPost = new Post ();
		String actual = testPost.getUser();
		String assertion = "A User";
		
		assertTrue(assertion.equals(actual));
	}

	@Test
	public void getpost_method_returns__post() {
		Post testPost = new Post();
		String actual = testPost.getPost();
		String assertion = "";
		assertTrue(assertion.equals(actual));
	}

	@Test
	public void getpostedon_method_returns_now() {
		Post testPost = new Post ();
		LocalDate actual = testPost.getPostedOn();
		LocalDate assertion = LocalDate.now();
		assertTrue(assertion.equals(actual));
	}
	@Test
	public void constructor_assigns_username() {
		Post testPost = new Post ("Alice");
		String actual = testPost.getUser();
		String assertion = "Alice";
		assertTrue(assertion.equals(actual));
	}
	@Test
	public void setpost_method_returns_thisisatestpost_post() {
		Post testPost = new Post ();
		testPost.setPost("thisisatestpost");
		String actual = testPost.getPost();
		String assertion = "thisisatestpost";
		assertTrue(assertion.equals(actual));
	}
	@Test
	public void showpost_returns_thisisatestpost_post() {
		Post testPost = new Post ();
		String actual = testPost.showPost();
		String assertion = "";
		assertTrue(assertion.equals(actual));
	}
	
}
