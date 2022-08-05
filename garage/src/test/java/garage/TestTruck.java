package garage;

import static org.junit.Assert.*;
import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestTruck {
	
	@Test
	public void Turck_ReturnsValidNumberPlate() throws Exception {
		TestVehicle.vehicle_ReturnsValidNumberPlate(new Truck("B5662BM",500,250));
	}
	
	@Test
	public void Truck_ReturnsValidFuelPer100Km() throws Exception {
		Truck operator = new Truck("B5662BM",500,250);
		
		assertEquals(operator.getFuelPer100Km(),12.5,0);
	}
	
	@Test
	public void Truck_ReturnsValidMaxLoad() throws Exception {
		Truck operator = new Truck("B5662BM",500,250);
		
		assertEquals(operator.getMaxLoad(),500,0);
	}
	
	@Test
	public void Truck_ReturnsValidCurrentLoad() throws Exception {
		Truck operator = new Truck("B5662BM",500,250);
		
		assertEquals(operator.getCurrentLoad(),250,0);
	}
	
	@Test
	public void Truck_DoesNotExceedMaxLoad() throws Exception {
		try {
			@SuppressWarnings("unused")
			Truck operator = new Truck("B5662BM",500,600);
		}
		catch(Exception e){
			return;
		}
		Assert.fail();
	}

}
