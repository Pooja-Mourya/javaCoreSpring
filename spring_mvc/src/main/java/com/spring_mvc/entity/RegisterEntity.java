package com.spring_mvc.entity;

public class RegisterEntity {

	private int id;
	private String fullName;
	private String gmail;
	private String password;
	private String check;
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
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	@Override
	public String toString() {
		return "RegisterEntity [id=" + id + ", fullName=" + fullName + ", gmail=" + gmail + ", password=" + password
				+ ", check=" + check + "]";
	}
	
	

}
