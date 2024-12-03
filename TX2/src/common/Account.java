package common;

import model.Role;
import model.Status;

public class Account extends Person {
	private String userName;
	private String password;
	private Role role;
	private Status status;
	/**
	 * 
	 */
	public Account() {
		super();
	}
	/**
	 * @param username
	 * @param password
	 * @param role
	 * @param status
	 */
	public Account(String id, String fullName,int age,Address address,String birthday, String userName, String password, Role role, Status status) {
		super(id,fullName,age,address,birthday);
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.status = status;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "id = " + id 
				+ ", fullName = " + fullName 
				+ ", age = " + age 
				+ ", address = " + address 
				+ ", birthday = "+ birthday 
				+"userName=" + userName 
				+ ", password=" + password 
				+ ", role=" + role 
				+ ", status=" + status;
	}
}
