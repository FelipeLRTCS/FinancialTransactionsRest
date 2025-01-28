package com.financtrsc.financialtransactions.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//TODO implementar JWT nisso aq, criptografar password e tudo mais
	
	private String userId;
	private String username;
	private String userPassword;
	private String userEmail;
	private String userPhone;
	private Integer userTransactionsQuantity;
	
	public User() {
		
	}

	public User(String userId, String username, String userPassword, String userEmail, String userPhone, Integer userTransactionsQuantity) {
		this.userId = userId;
		this.username = username;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userTransactionsQuantity = userTransactionsQuantity;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Integer getUserTransactionsQuantity() {
		return userTransactionsQuantity;
	}

	public void setUserTransactionsQuantity(Integer userTransactionsQuantity) {
		this.userTransactionsQuantity = userTransactionsQuantity;
	}

	public String getUserId() {
		return userId;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId, userPassword, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userPassword, other.userPassword)
				&& Objects.equals(username, other.username);
	}
}