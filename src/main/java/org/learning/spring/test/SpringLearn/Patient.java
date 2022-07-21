package org.learning.spring.test.SpringLearn;

import java.util.List;

public class Patient {

	private int id;
	private String name;
	
	List<EmergencyContact> emergencyContacts;

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

	/**
	 * @return the emergencyContacts
	 */
	public List<EmergencyContact> getEmergencyContacts() {
		return emergencyContacts;
	}

	/**
	 * @param emergencyContacts the emergencyContacts to set
	 */
	public void setEmergencyContacts(List<EmergencyContact> emergencyContacts) {
		this.emergencyContacts = emergencyContacts;
	}

	public void speak() {
		System.out.println("Hello, UM sick");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", emergencyContacts=" + emergencyContacts + "]";
	}
}
