package com.vehiclemanagement.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vehiclemanagement.beans.ServiceCenter;

public class MainApp {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml"))
		{
			ServiceCenter sc = ctx.getBean(ServiceCenter.class);
			sc.performService();	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
