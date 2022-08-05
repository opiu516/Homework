package garage;

import static org.junit.Assert.*;

public class TestVehicle {
	
	
	public static void vehicle_ReturnsValidNumberPlate(Vehicle operator) {		
		assertEquals(operator.getNumberPlate(),"B5662BM");
	}
	
	
}
