package Services;

import Entities.Floor;
import Repositories.FloorRepository;

public class FloorService {

	 private FloorRepository floorRepository;

	    public FloorService(FloorRepository floorRepository) {
	        this.floorRepository = floorRepository; 
	    }
	    
	    public FloorService()
	    {
	    	
	    }
	    public void addFloor(Floor floor) {
	        floorRepository.saveFloor(floor);
	    }

	    public Floor getFloorByNumber(int floorNumber) {
	        return floorRepository.getFloorByNumber(floorNumber);
	    }

	    public void removeFloor(Floor floor) {
	        floorRepository.removeFloor(floor);
	    }
}
