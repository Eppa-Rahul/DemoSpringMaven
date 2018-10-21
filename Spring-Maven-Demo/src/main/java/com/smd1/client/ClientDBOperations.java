package com.smd1.client;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.smd1.dao.ClientDAO;
import com.smd1.entity.ClientTO;

public class ClientDBOperations {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 1;
		
		int custId = 0;
		String name = null;
		String address = null;
		String clintName=null,clientStreet=null;
		
		
		ClientTO clientTO = null;
		List<ClientTO> clintList=null;
		
		ClientDAO clientDAO = null;
		
		Scanner scCustomer = new Scanner(System.in);
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		clientDAO = (ClientDAO)appContext.getBean("clientDAO");
		
		Outer:
		while(choice != 0){
			System.out.println("Following is the choice:");
			System.out.println("1. Insert");
			System.out.println("2. Insert using procedure");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. View Specific Client");
			System.out.println("6. View Simmilar Clients");
			System.out.println("0. Exit");
			
			choice = Integer.parseInt(scCustomer.nextLine());
			
			switch(choice){
			case 1:
				/*System.out.print("Enter Customer ID: ");
				custId = Integer.parseInt(scCustomer.nextLine());
				
				System.out.print("Enter Customer Name: ");
				name = scCustomer.nextLine();
				
				System.out.print("Enter Customer Address: ");
				address = scCustomer.nextLine();
				
				clientTO = new ClientTO(custId, name, address);
				client.insertCustomer(clientTO);
				System.out.println("Record inserted");
				break;*/
			case 2:
				/*System.out.print("Enter Customer ID: ");
				custId = Integer.parseInt(scCustomer.nextLine());
				
				System.out.print("Enter Customer Name: ");
				name = scCustomer.nextLine();
				
				System.out.print("Enter Customer Address: ");
				address = scCustomer.nextLine();
				
				clientTO = new ClientTO(custId, name, address);
				client.insertUsingProcedure(clientTO);
				System.out.println("Record inserted using procedure");
				break;*/
			case 3:
				/*System.out.print("Enter Customer ID: ");
				custId = Integer.parseInt(scCustomer.nextLine());
				
				System.out.print("Enter Customer Name: ");
				name = scCustomer.nextLine();
				
				System.out.print("Enter Customer Address: ");
				address = scCustomer.nextLine();
				
				clientTO = new ClientTO(custId, name, address);
				client.updateCustomer(clientTO);
				System.out.println("Record updated");
				break;*/
			case 4:
				/*System.out.print("Enter Customer ID of the record to be deleted: ");
				custId = Integer.parseInt(scCustomer.nextLine());
				
				clientTO = new ClientTO(custId, name, address);
				client.deleteCustomer(clientTO);
				System.out.println("Record deleted");
				break;*/
			case 5:
				System.out.print("Enter Customer ID of the record to be viewed: ");
				custId = Integer.parseInt(scCustomer.nextLine());
				clientTO = clientDAO.getRowDetails(custId);
				System.out.println(clientTO);
				break;
			case 6:
				System.out.print("Enter Customer Name to find simillar clients: ");
				clintName = scCustomer.nextLine();
				clintList = clientDAO.getRowsDetails(clintName);
				System.out.println(clintList);
				break;				
			case 7:
				System.out.print("Enter Customer Name to find simillar clients: ");
				clientStreet  = scCustomer.nextLine();
				clintList = clientDAO.getBulkRowsDetails(clientStreet);
				System.out.println(clintList);
				break;	
				
			case 0:
				break Outer;
				default:
					break;
			}
		}
	}
}