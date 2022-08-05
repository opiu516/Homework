package garage;

public class Car extends Vehicle{
	
	private double engine;
	
	public Car(String temp1, double temp2) throws Exception {
		super(temp1);
		changEngine(temp2);
	}
	
	public void validateEngine(double temp1) throws Exception {
		if(temp1 <= 0) {
			throw new Exception("Bad Info");
		}
	}
	
	public void changEngine(double temp1) throws Exception {
		validateEngine(temp1);
		engine = temp1;
		calcFuelEconomy();
		
	}
	
	public void calcFuelEconomy() {
		fuelPer100Km = engine*3;;
	}
	
	
	public double getEngine() {
		return engine;
	}

}
