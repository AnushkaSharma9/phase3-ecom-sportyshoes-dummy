package com.anushka.sportyshoes_ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ecom_users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private long id;
	@Column(name="user_name")
	private String username;
	@Column(name="user_password")
	private String password;
	@Column(name="user_roles")
	private String roles;
	@Column(name="user_loggedIn")
    private boolean loggedIn;
	public User(long id, String username, String email, String password, String roles,boolean loggedIn) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.roles = roles;
		this.loggedIn = false;
	}
	public User() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getRoles() {
		return roles;
	}
	
	public void setRoles(String roles) {
		this.roles = roles;
	}
	
	public boolean isLoggedIn() {
	        return loggedIn;
	    }
	public void setLoggedIn(boolean loggedIn) {
	        this.loggedIn = loggedIn;
	    }
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", roles=" + roles
				+ ", loggedIn=" + loggedIn + "]";
	}

	

}

