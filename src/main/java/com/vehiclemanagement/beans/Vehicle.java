package com.vehiclemanagement.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {
	private String vehicleName;
	private Engine engine;
	private Tyre tyre;
	
	@Autowired
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public Vehicle(Engine engine) {
		this.engine = engine;
	}
	
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public void displayVehicleInfo() {
		System.out.println("Vehicle: "+vehicleName);
		engine.showEngineDetails();
		tyre.showTyreDetails();
	}

}
