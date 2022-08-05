package garage;

public abstract class Vehicle {
	protected String numberPlate;
	protected double fuelPer100Km;
	
	public Vehicle(String temp1) {
		numberPlate = temp1;
	}
	
	
	public String getNumberPlate() {
		return numberPlate;
	}
	
	public double getFuelPer100Km() {
		return fuelPer100Km;
	}
	
	public void calcFuelEconomy(double temp1) {}
}
