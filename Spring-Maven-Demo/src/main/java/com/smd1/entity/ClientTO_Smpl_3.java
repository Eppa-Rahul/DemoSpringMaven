package com.smd1.entity;

public class ClientTO_Smpl_3 implements ClientTO {
	


	private String name;
	private String emailID;
	private String password;
	private String phone_num;
	private String type;
	private String regDate;
	
	public ClientTO_Smpl_3() {
		// TODO Auto-generated constructor stub
	}	

	public ClientTO_Smpl_3(String clientName, String clientHNO, String clientLND, String clientLOC, String clientStreet,
			String clientCity,String emailID,String password,String phone_num,String type,String regDate) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "ClientTO_Smpl_3 [name=" + name + ", emailID=" + emailID + ", password=" + password + ", phone_num="
				+ phone_num + ", type=" + type + ", regDate=" + regDate + "]";
	}

	@Override
	public void setStreet(String string) {
		// TODO Auto-generated method stub
		
	}
	


	

	
	
	

}