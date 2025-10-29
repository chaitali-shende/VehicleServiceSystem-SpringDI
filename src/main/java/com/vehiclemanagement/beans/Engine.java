package com.vehiclemanagement.beans;

public class Engine {
	private String engineType;
	private int horsePower;
	
	public Engine(String engineType, int horsePower) {
		super();
		this.engineType = engineType;
		this.horsePower = horsePower;
	}
	
	public void showEngineDetails() {
	        System.out.println("Engine Details: Type = " + engineType + ", HorsePower = " + horsePower);
	}
}
