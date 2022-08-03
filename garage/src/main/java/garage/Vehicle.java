package garage;

public class Vehicle {
	protected String numberPlate;
	protected double fuelPer100Km;
	
	public Vehicle(String temp1,double temp2) {
		numberPlate = temp1;
		fuelPer100Km = temp2;
	}
	
	
	public String getNumberPlate() {
		return numberPlate;
	}
	
	public double getFuelPer100Km() {
		return fuelPer100Km;
	}
}
