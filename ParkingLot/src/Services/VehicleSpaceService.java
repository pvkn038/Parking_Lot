package Services;

import java.util.List;

import Entities.VehicleSpace;
import Repositories.VehicleSpaceRepository;

public class VehicleSpaceService {

	 private VehicleSpaceRepository vehicleSpaceRepository;
	 
	 public VehicleSpaceService(VehicleSpaceRepository vehicleSpaceRepository) {
	        this.vehicleSpaceRepository = vehicleSpaceRepository;
	    }
	 
	 
	 public void addVehicleSpace(VehicleSpace vehicleSpace)
	 {
		 vehicleSpaceRepository.saveSpace(vehicleSpace);
	 }
	 
	 public List<VehicleSpace> getAvailableSpaces() {
	        return vehicleSpaceRepository.getAvailableSpaces();
	    }
}
