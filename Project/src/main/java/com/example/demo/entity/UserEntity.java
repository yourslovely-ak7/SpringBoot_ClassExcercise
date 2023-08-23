package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class UserEntity {

	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	@Column(name="user_name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="e-mailAddress")
	private String mail;
	@Column(name="mobile_number")
	private long mobileNo;
	@Column(name="aadhar_number")
	private long aadharNo;
	
	public UserEntity(int userId, String name, int age, String mail, long mobileNo, long aadharNo)
	{
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.mail = mail;
		this.mobileNo = mobileNo;
		this.aadharNo = aadharNo;
	}
	
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	
}
