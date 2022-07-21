package org.learning.spring.test.testproject;

public class Address {
	private String street;
	private String zone;
	
	public void onCreate() {
		System.out.println(" created " + this);
	}
	public void onDestroy() {
		System.out.println(" destroyed " + this);
	}

	public Address() {
	}

	public Address(String street, String zone) {
		super();
		this.street = street;
		this.zone = zone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", zone=" + zone + "]";
	}

}
