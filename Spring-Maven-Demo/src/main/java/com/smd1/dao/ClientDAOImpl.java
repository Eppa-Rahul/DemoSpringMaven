package com.smd1.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.smd1.entity.ClientTO;


public class ClientDAOImpl implements ClientDAO {
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void insertClient(ClientTO clientTO) {
/*		String query = "INSERT INTO client100 VALUES(?,?,?)";
		
		Integer custId = client.getCustomerId();
		String name = client.getName();
		String address = client.getAddress();
		
		jdbcTemplate.update(query, new Object[]{custId,name,address});*/
	}

	@Override
	public void updateClient(ClientTO clientTO) {
/*		String query = "UPDATE client100 SET clientId=?, clientname=?, address=?"
				+ "WHERE clientId=?";
		
		Integer custId = client.getCustomerId();
		String name = client.getName();
		String address = client.getAddress();
		
		jdbcTemplate.update(query, new Object[]{custId,name,address,custId});*/
	}

	@Override
	public void deleteClient(ClientTO clientTO) {
/*		String query = "DELETE FROM client100 WHERE clientId=?";
		
		Integer custId = client.getCustomerId();
				
		jdbcTemplate.update(query, new Object[]{custId});*/
	}

	@Override
	public void insertUsingProcedure(ClientTO clientTO) {
/*		String query = "{CALL insertit(?,?,?)}";
		
		Integer custId = client.getCustomerId();
		String name = client.getName();
		String address = client.getAddress();
		
		jdbcTemplate.update(query, new Object[]{custId,name,address});*/
	}

	@Override
	public ClientTO getRowDetails(Integer custId) {
		// TODO Auto-generated method stub
		ClientTO  clientFound = null;
		
		String query = "SELECT * FROM client_dummy WHERE CLIENT_ID = ?";
		RowMapper<ClientTO> reoMapperObj=new RowMapper<ClientTO>(){ 
			@Override
			public ClientTO mapRow(ResultSet resultSet, int rowNum) throws SQLException{
				String clientName  = resultSet.getString("CLIENT_NAME");
				String clientHNO = resultSet.getString("CLIENT_HNO");
				String clientStreet = resultSet.getString("CLIENT_STREET");
				String clientLND = resultSet.getString("CLIENT_LNDMRK");
				String clientLOC = resultSet.getString("CLIENT_LOCALITY");
				
				ClientTO client = new ClientTO( clientName,  clientHNO,  clientLND,  clientLOC,  clientStreet);
				return client;
			}
		};
		try {
			clientFound = (ClientTO)jdbcTemplate.queryForObject(query, new Object[]{custId},reoMapperObj);
		}catch(EmptyResultDataAccessException ex) {
			System.out.println("No client exists with given id");
			
		}
		return clientFound;
	}
	@Override
	public List<ClientTO>  getRowsDetails(String clientName) {
		// TODO Auto-generated method stub
		List<ClientTO> clientsFound = null;
		
		String query = "SELECT * FROM client_dummy WHERE CLIENT_NAME LIKE ?";
		RowMapper<List<ClientTO>> rwoMapperObj=new RowMapper<List<ClientTO>>(){ 
			@Override
			public List<ClientTO> mapRow(ResultSet resultSet, int rowNum) throws SQLException{
				List<ClientTO> clientList = new ArrayList<ClientTO>();
				while(resultSet.next()){
					String clientName  = resultSet.getString("CLIENT_NAME");
					String clientHNO = resultSet.getString("CLIENT_HNO");
					String clientStreet = resultSet.getString("CLIENT_STREET");
					String clientLND = resultSet.getString("CLIENT_LNDMRK");
					String clientLOC = resultSet.getString("CLIENT_LOCALITY");					
					ClientTO client= new ClientTO( clientName,  clientHNO,  clientLND,  clientLOC,  clientStreet);
					System.out.println("     "+client);
					clientList.add(client);
					System.out.println("        "+clientList);
				}
				return clientList;
			}
		};
		try {
			clientsFound = (List<ClientTO>)jdbcTemplate.queryForObject(query, new Object[]{clientName},rwoMapperObj);
		}catch(EmptyResultDataAccessException ex) {
			System.out.println("No client exists with given id");
			
		}
		return clientsFound;
	}



	}	
