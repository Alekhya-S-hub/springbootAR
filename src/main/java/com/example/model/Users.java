package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;


@Entity
@Table(name="users")
public class Users{
	
	public Users() {}
	public Users(int user_id, String user_name) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	@Column(name="user_id")
	private int user_id;
	@Column(name="user_name")
	private String user_name;
	 
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", user_name=" + user_name + "]";
	}
}