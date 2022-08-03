package garage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTruck {

	@Test
	public void Truck_ReturnsValidFuelPer100Km() {
		Truck operator = new Truck("B5662BM",500,250);
		
		assertEquals(operator.getFuelPer100Km(),12.5,0);
	}
	
	@Test
	public void Truck_ReturnsValidMaxLoad() {
		Truck operator = new Truck("B5662BM",500,250);
		
		assertEquals(operator.getMaxLoad(),500,0);
	}
	
	@Test
	public void Truck_ReturnsValidCurrentLoad() {
		Truck operator = new Truck("B5662BM",500,250);
		
		assertEquals(operator.getCurrentLoad(),250,0);
	}
	
	@Test
	public void Truck_DoesNotExceedMaxLoad() {
		Truck operator = new Truck("B5662BM",500,600);
		
		assertEquals(operator.getCurrentLoad(),500,0);
	}

}
