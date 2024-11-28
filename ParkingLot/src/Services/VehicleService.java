package Services;

import Entities.Vehicle;
import Repositories.VehicleRepository;

public class VehicleService {

	private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
    
    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.saveVehicle(vehicle); 

    }
    public void removeVehicle(Vehicle vehicle) {
        vehicleRepository.removeVehicle(vehicle);
    }
    
    public Vehicle getVehicleByRegnNo(String regnNo)
    {
    	return vehicleRepository.getVehicleByRegnNo(regnNo);
    }
}
