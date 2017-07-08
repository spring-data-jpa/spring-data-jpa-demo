package com.phearun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="address")
public class Address {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="zip_code")
	private String zipCode;
	
	@Column(name="city")
	private String city;
	
	public Address() {
		super();
	}

	public Address(int id, String zipCode, String city) {
		super();
		this.id = id;
		this.zipCode = zipCode;
		this.city = city;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [id=" + id +", zipCode=" + zipCode + ", city=" + city + "]";
	}
}
