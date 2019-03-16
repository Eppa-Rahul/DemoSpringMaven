package com.smd1.dao;

import java.util.List;

import com.smd1.entity.ClientTO;

public interface ClientDAO {
	public void insertClient(ClientTO clientTO);
	public void updateClient(ClientTO clientTO);
	public void deleteClient(ClientTO clientTO);
	public ClientTO getRowDetails(Integer custId);
	public List<ClientTO>  getRowsDetails(String clientName);
	public void insertUsingProcedure(ClientTO clientTO);
	public List<ClientTO> getBulkRowsDetails(String clientStreet);
}