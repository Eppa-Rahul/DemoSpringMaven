package com.smd1.entity;

public class ClientTO {

	private String clientName;
	private String clientHNO;
	private String clientLND;
	private String clientLOC;
	private String clientStreet;
	public ClientTO(String clientName, String clientHNO, String clientLND, String clientLOC, String clientStreet) {
		super();
		this.clientName = clientName;
		this.clientHNO = clientHNO;
		this.clientLND = clientLND;
		this.clientLOC = clientLOC;
		this.clientStreet = clientStreet;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientHNO() {
		return clientHNO;
	}
	public void setClientHNO(String clientHNO) {
		this.clientHNO = clientHNO;
	}
	public String getClientLND() {
		return clientLND;
	}
	public void setClientLND(String clientLND) {
		this.clientLND = clientLND;
	}
	public String getClientLOC() {
		return clientLOC;
	}
	public void setClientLOC(String clientLOC) {
		this.clientLOC = clientLOC;
	}
	public String getClientStreet() {
		return clientStreet;
	}
	public void setClientStreet(String clientStreet) {
		this.clientStreet = clientStreet;
	}
	@Override
	public String toString() {
		return "CustomerTO [clientName=" + clientName + ", clientHNO=" + clientHNO + ", clientLND=" + clientLND
				+ ", clientLOC=" + clientLOC + ", clientStreet=" + clientStreet + "]";
	}
	
	
	

}