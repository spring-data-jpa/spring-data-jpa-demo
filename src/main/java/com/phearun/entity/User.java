package com.phearun.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="status")
	private boolean status;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	public User() {
		super();
	}
	public User(int id, String username, String password, boolean status) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", status=" + status + "]";
	}	
}
