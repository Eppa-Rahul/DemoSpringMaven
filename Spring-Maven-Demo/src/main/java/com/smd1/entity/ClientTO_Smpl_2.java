package com.smd1.entity;

public class ClientTO_Smpl_2 implements ClientTO {

	
	private String name;
	private String street;
	private String HNO;
	private String landMark;
	private String location;
	private String city;
	private String emailID;
	private String password;
	private String phone_num;
	private String type;
	private String regDate;
	
	public ClientTO_Smpl_2() {
		// TODO Auto-generated constructor stub
	}	
	public ClientTO_Smpl_2(String name, String HNO, String landMark, String location, String street) {
		super();
		this.name = name;
		this.HNO = HNO;
		this.landMark = landMark;
		this.location = location;
		this.street = street;
	}


	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHNO() {
		return HNO;
	}
	public void setHNO(String hNO) {
		HNO = hNO;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "ClientTO_Smpl2 [name=" + name + ", street=" + street + ", HNO=" + HNO + ", landMark=" + landMark
				+ ", location=" + location + ", city=" + city + ", emailID=" + emailID + ", password=" + password
				+ ", phone_num=" + phone_num + ", type=" + type + ", regDate=" + regDate + "]";
	}

	
	
	

}