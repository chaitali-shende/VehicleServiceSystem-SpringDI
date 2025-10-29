package com.vehiclemanagement.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceCenter {
	private Vehicle vehicle;
	private String serviceType;
	
	@Autowired
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void performService() {
		System.out.println("=== Vehicle Manufacturing & Service System ===");
		vehicle.displayVehicleInfo();
		System.out.println("Service Type: "+serviceType);
	}
}
