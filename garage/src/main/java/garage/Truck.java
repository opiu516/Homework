package garage;

public class Truck extends Vehicle{
	
	private double maxLoad;
	private double currentLoad;
	
	public Truck(String temp1, double temp2,double temp3) throws Exception {
		super(temp1);
		setMaxLoad(temp2);
		setCurrentLoad(temp3);
	}
	
	public void calcFuelEconomy() {
		fuelPer100Km = 10 + currentLoad/100;
	}
	
	public void validateCurrentLoad(double temp1) throws Exception {
		if(temp1 > maxLoad || temp1 < 0){
			throw new Exception("Bad Info");
		}	
	}
	
	public void validateMaxLoad(double temp1) throws Exception {
		if(temp1 < 0){
			throw new Exception("Bad Info");
		}	
	}
	
	public void setMaxLoad(double temp1) throws Exception {
		validateMaxLoad(temp1);
		maxLoad = temp1;
	}
	
	public void setCurrentLoad(double temp1) throws Exception {
		validateCurrentLoad(temp1);
		currentLoad = temp1;
		calcFuelEconomy();
	}
	
	public double getMaxLoad() {
		return maxLoad;
	}
	public double getCurrentLoad() {
		return currentLoad;
	}
	
}
