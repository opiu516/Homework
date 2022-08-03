package garage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVehicle {

	@Test
	public void vehicle_ReturnsValidNumberPlate() {
		Vehicle operator = new Vehicle("B5662BM",6);
		
		assertEquals(operator.getNumberPlate(),"B5662BM");
	}
	
	@Test
	public void vehicle_ReturnsValidFuelPer100Km() {
		Vehicle operator = new Vehicle("B5662BM",6);
		
		assertEquals(operator.getFuelPer100Km(),6,0);
	}

}
