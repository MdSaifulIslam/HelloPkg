package org.learning.spring.test.testproject;

public class Patient {

	private int id;
	private String name;
	
	public void onCreate() {
		System.out.println("Created " + this);
	}
	
	public void onDestroy() {
		System.out.println("Destroyed " + this);
	}

	public Patient() {
	}

	public Patient(int id, String name) {
		this.id = id;
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + "]";
	}
	
	public void speak() {
		System.out.println("Hello, UM sick");
	}
}