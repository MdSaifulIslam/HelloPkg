package org.learning.spring.test.SpringLearn;

import java.util.List;

public class Patient {

	private int id;
	private String name;
	
	private List<String> energencyContactList;

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
	
	public List<String> getEnergencyContactList() {
		return energencyContactList;
	}

	public void setEnergencyContactList(List<String> energencyContactList) {
		this.energencyContactList = energencyContactList;
	}
	
	
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", energencyContactList=" + energencyContactList + "]";
	}

	public void speak() {
		System.out.println("Hello, UM sick");
	}
}
