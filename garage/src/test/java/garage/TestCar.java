package garage;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestCar {

	@Test
	public void Car_ReturnsValidFuelPer100Km() throws Exception {
		Car operator = new Car("B5662BM",2.0);
		
		assertEquals(operator.getFuelPer100Km(),6,0);
	}
	
	@Test
	public void Car_ReturnsValidEngine() throws Exception {
		Car operator = new Car("B5662BM",2.0);
		
		assertEquals(operator.getEngine(),2,0);
	}
	
	@Test
	public void Car_ReturnsValidNumberPlate() throws Exception {
		TestVehicle.vehicle_ReturnsValidNumberPlate(new Car("B5662BM",2));
	}
	
	@Test
	public void Car_ThrowsExceptionIfInvalidEngine() {
		try {
			@SuppressWarnings("unused")
			Car operator = new Car("Abcd",-2);
		}
		catch(Exception e) {
			return;
		}
		
		Assert.fail();
	}
	

}
