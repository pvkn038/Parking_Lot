package Repositories;

import java.util.ArrayList;
import java.util.List;

import Entities.VehicleSpace;

public class VehicleSpaceRepository {
	 private List<VehicleSpace> spaces = new ArrayList<>();

	    public void saveSpace(VehicleSpace vehicleSpace) {
	        spaces.add(vehicleSpace);
	    }

	    public List<VehicleSpace> getAvailableSpaces() {
	        
	    	List<VehicleSpace> availableSpaces = new ArrayList<>();
	        for (VehicleSpace space : spaces) {
	            if (space.isAvailability()) {
	                availableSpaces.add(space);
	            }
	        }
	        return availableSpaces;
	    }

}
