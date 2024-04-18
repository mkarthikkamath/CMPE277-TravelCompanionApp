package com.sjsu.cloud.travelapp.model;

public class User {
	private String userEmail;
    private String userFirstName;
    private String userLastName;
    private String userPassword;
    
	public User() {
		super();
	}

	/**
	 * @param userEmail
	 * @param userFirstName
	 * @param userLastName
	 * @param userPassword
	 */
	public User(String userEmail, String userFirstName, String userLastName, String userPassword) {
		super();
		this.userEmail = userEmail;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "User [userEmail=" + userEmail + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userPassword=" + userPassword + "]";
	}
}
