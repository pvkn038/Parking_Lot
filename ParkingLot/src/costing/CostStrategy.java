package costing;

import java.util.HashMap;
import java.util.Map;

import Entities.Vehicle;
import enums.VehicleType;

public class CostStrategy {
	private Map<VehicleType, Double> hourlyRates = new HashMap<>();
	
	public CostStrategy() {
        hourlyRates.put(VehicleType.BIKE, 10.0);
        hourlyRates.put(VehicleType.CAR, 20.0);
        hourlyRates.put(VehicleType.SPORTSCAR, 20.0);
        hourlyRates.put(VehicleType.BUS, 30.0);
        hourlyRates.put(VehicleType.TRUCK, 30.0);
    }
	 public double calculateCost(Vehicle vehicle, long durationInHours) {
	        double hourlyRate = hourlyRates.get(vehicle.getVehicleType());
	        return hourlyRate * durationInHours;
	    }

}
