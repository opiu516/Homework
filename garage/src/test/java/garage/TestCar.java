package garage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCar {

	@Test
	public void Car_ReturnsValidFuelPer100Km() {
		Car operator = new Car("B5662BM",2.0);
		
		assertEquals(operator.getFuelPer100Km(),6,0);
	}
	
	@Test
	public void Car_ReturnsValidEngine() {
		Car operator = new Car("B5662BM",2.0);
		
		assertEquals(operator.getEngine(),2,0);
	}

}
