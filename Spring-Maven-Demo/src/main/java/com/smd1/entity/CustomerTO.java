package com.smd1.entity;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class CustomerTO {

	private Long custId;
	private String custName;
	private String custMail;	
	private Integer custPhone;	
	private String custPassword;
	private String address;	

	public CustomerTO() {
		super();
	}


	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	
	public void setCustId() {
        Calendar rightNow = Calendar.getInstance();       
        SimpleDateFormat df = new SimpleDateFormat("ddMMyyHHmmss");
        this.custId = Long.parseLong(df.format(rightNow.getTime())); 
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

   
	public String getCustMail() {
		return custMail;
	}

	public void setCustMail(String custMail) {
		this.custMail = custMail;
	}

	public Integer getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(Integer custPhone) {
		this.custPhone = custPhone;
	}

	public String getCustPassword() {
		return custPassword;
	}

	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "CustomerTO [custId=" + custId + ", custName=" + custName + ", custMail=" + custMail + ", custPhone="
				+ custPhone + ", custPassword=" + custPassword + ", address=" + address + "]";
	}



	


}