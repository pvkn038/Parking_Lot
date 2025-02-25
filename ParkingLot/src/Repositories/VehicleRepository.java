package Repositories;

import java.util.HashMap;
import java.util.Map;

import Entities.Vehicle;

public class VehicleRepository {
	 private Map<String, Vehicle> vehicles = new HashMap<>();

	    public void saveVehicle(Vehicle vehicle) {
	        vehicles.put(vehicle.getRegnNo(), vehicle);
	    }

	    public Vehicle getVehicleByRegnNo(String regnNo) {
	        return vehicles.get(regnNo);
	    }
	    
	    public void removeVehicle(Vehicle vehicle)
	    {
	    	vehicles.remove(vehicle);
	    }
}
