package Entities;

import java.util.List;

import costing.CostStrategy;

public class ParkingLot {

	private int noOfFloors;
	private int noOfSpaces;
	private CostStrategy costStrategy;
	 private List<Floor> floors;
	
	public ParkingLot() {
		
	}
	public int getNoOfFloors() {
		return noOfFloors;
	}
	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	public int getNoOfSpaces() {
		return noOfSpaces;
	}
	public void setNoOfSpaces(int noOfSpaces) {
		this.noOfSpaces = noOfSpaces;
	}
	public CostStrategy getCostStrategy() {
		return costStrategy;
	}
	public void setCostStrategy(CostStrategy costStrategy) {
		this.costStrategy = costStrategy;
	}
	public List<Floor> getFloors() {
		return floors;
	}
	public void setFloors(List<Floor> floors) {
		this.floors = floors;
	}
	
	public void addFloor(Floor floor) {
        floors.add(floor);
    }
}
