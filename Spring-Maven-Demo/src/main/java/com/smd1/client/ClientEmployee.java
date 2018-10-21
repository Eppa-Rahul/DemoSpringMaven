package com.smd1.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smd1.entity.CustomerTO;



public class ClientEmployee {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	CustomerTO customerTO=(CustomerTO) context.getBean("CustomerTO");
	System.out.println(customerTO);
	
	context.close();
	}

}
