package garage;
import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> vehiclesInGarage = new ArrayList<Vehicle>();
	
	public void addMultipleVehicles(ArrayList<Vehicle> temp1) {
		vehiclesInGarage.addAll(temp1);
	}
	
	public void addVehicle(Vehicle temp1) {
		vehiclesInGarage.add(temp1);
	}
	
	public ArrayList<Vehicle> getVehiclesInGarage() {
		return vehiclesInGarage;
	}
	
	public double AvaragefuelPer100Km() {
		double sum = 0;
		int numberOfVehicles = vehiclesInGarage.size();
		if(numberOfVehicles == 0) {
			return 0;
		}
		for(int i = 0;i < numberOfVehicles;i++) {
			sum += vehiclesInGarage.get(i).getFuelPer100Km();
		}
		return sum/numberOfVehicles;
	}
	
}
