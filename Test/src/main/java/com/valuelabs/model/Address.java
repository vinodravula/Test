package com.valuelabs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address extends KeyClass {

	@Id
	private String street;
	private int pin;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
