package com.vehiclemanagement.beans;

import org.springframework.stereotype.Component;

@Component("tyre")
public class Tyre {
	private String brand;
	private int size;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public void showTyreDetails() {
		System.out.print("Tyre Details: Brand= "+brand);
		System.out.println(", Size= "+size);
	}
}
