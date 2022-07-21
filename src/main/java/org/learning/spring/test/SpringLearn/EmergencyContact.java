package org.learning.spring.test.SpringLearn;

public class EmergencyContact {
	private String name;
	private String phoneNumber;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "EmergencyContact [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
