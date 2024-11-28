package Entities;

import enums.VehicleType;

public class VehicleSpace {
	
	private int spaceNo;
	private boolean availability;
	private VehicleType vehicleType;
	
	public VehicleSpace(int spaceNo, boolean availability, VehicleType vehicleType) {
		super();
		this.spaceNo = spaceNo;
		this.availability = availability;
		this.vehicleType = vehicleType;
	}
	public VehicleSpace(VehicleType vehicleType)
	{
		this.vehicleType = vehicleType;
	}
	public int getSpaceNo() {
		return spaceNo;
	}
	public void setSpaceNo(int spaceNo) {
		this.spaceNo = spaceNo;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

}
