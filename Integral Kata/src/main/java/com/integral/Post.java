package com.integral;

import java.time.LocalDate;

public class Post {
	String user = "A User";
	String post = "";		
	LocalDate postedOn = null;


	public Post(String user) {
		// TODO Auto-generated constructor stub
		this.user=user;
		this.postedOn=LocalDate.now();
	}




	public Post() {
		this.postedOn=LocalDate.now();
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((post == null) ? 0 : post.hashCode());
		result = prime * result + ((postedOn == null) ? 0 : postedOn.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (post == null) {
			if (other.post != null)
				return false;
		} else if (!post.equals(other.post))
			return false;
		if (postedOn == null) {
			if (other.postedOn != null)
				return false;
		} else if (!postedOn.equals(other.postedOn))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}




	public String getUser() {
		return user;
	}




	public String getPost() {
			return post;
	}




	public LocalDate getPostedOn() {
			return postedOn;
	}




	public void setPost(String post) {
		this.post=post;
	}




	public String showPost() {
		return post;
	}
	
}
