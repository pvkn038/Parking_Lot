import Entities.Vehicle;
import Services.FloorService;
import Services.ParkingLotService;
import Services.VehicleService;
import enums.VehicleType;

public class main {

	public static void main(String[] args)
	{
		System.out.println("HEllo World");
		
		ParkingLotService parkingLotService = new ParkingLotService();
		VehicleService vehicleService = new VehicleService();
		
		//init the parkinglot
		
		parkingLotService.createParkingLotINIT(2, 20, 5, 5, 1, 1);
		
		//adding and removing
		Vehicle vehicle = new Vehicle(VehicleType.BIKE,"TS12FY4458","red");
		vehicleService.addVehicle(vehicle);
		//can use remove function 
		
		
		
	}
}
