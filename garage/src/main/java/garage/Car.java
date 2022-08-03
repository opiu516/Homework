package garage;

public class Car extends Vehicle{
	
	private double engine;
	
	public Car(String temp1, double temp2) {
		super(temp1, 0);
		engine = temp2;
		fuelPer100Km = temp2*3;
	}
	
	public double getEngine() {
		return engine;
	}

}
