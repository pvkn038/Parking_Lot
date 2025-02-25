package Services;

import Entities.Floor;
import Entities.ParkingLot;
import Repositories.ParkingLotRepository;

public class ParkingLotService {
	 private ParkingLotRepository parkingLotRepository;
	 private FloorService floorService;
	 private VehicleService vehicleService;
	 
	 public ParkingLotService(ParkingLotRepository parkingLotRepository, FloorService floorService, VehicleService vehicleService) {
	        this.parkingLotRepository = parkingLotRepository;
	        this.floorService = floorService;
	        this.vehicleService = vehicleService;
	    }
	 
	 public ParkingLotService()
	 {
		 
	 }
	 
	 public void createParkingLotINIT(int numFloors, int bikeSpaces,int carSpaces,int sportsCarSpaces,int truckSpaces,int busSpaces) {
	        ParkingLot parkingLot = new ParkingLot();
	        for (int i = 0; i < numFloors; i++) {
	            Floor floor = new Floor(i + 1);
	            floor.addSpaces(bikeSpaces, carSpaces, sportsCarSpaces, truckSpaces, busSpaces);
	            parkingLot.addFloor(floor);
	        }
	        parkingLotRepository.saveParkingLot(parkingLot);
	    }
	 
	 

}
