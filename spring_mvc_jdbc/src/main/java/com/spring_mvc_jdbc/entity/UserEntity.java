package com.spring_mvc_jdbc.entity;

public class UserEntity {

	private int id;
	private String fullName;
	private String email;
	private String password;
	private String image;
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password
				+ " ]";
	}
	
	
	
}
