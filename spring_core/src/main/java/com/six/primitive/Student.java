package com.six.primitive;

public class Student {
	private int id;
	private String name;
	private String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	public void init() {
		System.out.println("init call : Initilization Started");
	}

	public void destroy() {
		System.out.println("Destroy call : Destroy Object");
	}

}
