package garage;

public class Truck extends Vehicle{
	
	private double maxLoad;
	private double currentLoad;
	
	public Truck(String temp1, double temp2,double temp3) {
		super(temp1,10);
		maxLoad = temp2;
		currentLoad = temp3;
		if(currentLoad > maxLoad){
			currentLoad = maxLoad;
		}
		fuelPer100Km += currentLoad/100;
	}
	
	public double getMaxLoad() {
		return maxLoad;
	}
	public double getCurrentLoad() {
		return currentLoad;
	}
	
}
