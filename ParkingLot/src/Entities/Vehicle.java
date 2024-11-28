package Entities;

import enums.VehicleType;

public class Vehicle {
	
	private VehicleType vehicleType;
	private String RegnNo;
	private String color;
	
	public Vehicle(VehicleType vehicleType, String regnNo, String color) {
		super();
		this.vehicleType = vehicleType;
		RegnNo = regnNo;
		this.color = color;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getRegnNo() {
		return RegnNo;
	}
	public void setRegnNo(String regnNo) {
		RegnNo = regnNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
