package Entities;

import java.util.List;

import enums.VehicleType;

public class Floor {
	
	private int floorNo;
	private List<VehicleSpace> vehicleSpaces;
	
	public Floor(int FloorNo)
	{
		this.floorNo = floorNo;
	}
	
	public Floor(int floorNo, List<VehicleSpace> vehicleSpaces) {
		super();
		this.floorNo = floorNo;
		this.vehicleSpaces = vehicleSpaces;
	}
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public List<VehicleSpace> getVehicleSpaces() {
		return vehicleSpaces;
	}
	public void setVehicleSpaces(List<VehicleSpace> vehicleSpaces) {
		this.vehicleSpaces = vehicleSpaces;
	}
	
	public void addSpaces(int bikeSpaces,int carSpaces,int sportsCarSpaces,int truckSpaces,int busSpaces)
	{
		for (int i = 0; i < bikeSpaces; i++) {
        	vehicleSpaces.add(new VehicleSpace(VehicleType.BIKE));
        }
		for (int i = 0; i < carSpaces; i++) {
			vehicleSpaces.add(new VehicleSpace(VehicleType.CAR));
        }
		for (int i = 0; i < sportsCarSpaces; i++) {
			vehicleSpaces.add(new VehicleSpace(VehicleType.SPORTSCAR));
        }
		for (int i = 0; i < truckSpaces; i++) {
			vehicleSpaces.add(new VehicleSpace(VehicleType.TRUCK));
        }
		for (int i = 0; i < busSpaces; i++) {
			vehicleSpaces.add(new VehicleSpace(VehicleType.BUS));
        }
        

	}

}
