package garage;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestGarage {

	@Test
	public void addMultipleVehicles_IsValidIfNoCarsInGarage() throws Exception {
		Garage operator = new Garage();
		ArrayList<Vehicle> toAdd = new ArrayList<Vehicle>();
		toAdd.add(new Truck("B5662BM",500,250));
		toAdd.add(new Car("B5662BA",2.0));
		
		operator.addMultipleVehicles(toAdd);
		assertArrayEquals(operator.getVehiclesInGarage().toArray(),toAdd.toArray());
	}
	
	@Test
	public void addMultipleVehicles_IsValidIfCarsInGarage() throws Exception {
		Garage operator = new Garage();
		ArrayList<Vehicle> toAdd = new ArrayList<Vehicle>();
		ArrayList<Vehicle> toAdd2 = new ArrayList<Vehicle>();
		
		toAdd.add(new Truck("B5662BM",500,250));
		toAdd.add(new Car("B5662BA",2.0));		
		operator.addMultipleVehicles(toAdd);
		
		toAdd2.add(new Truck("B5632BM",600,400));
		toAdd2.add(new Car("B5462BA",3.0));	
		operator.addMultipleVehicles(toAdd2);
		
		toAdd.addAll(toAdd2);
		assertArrayEquals(operator.getVehiclesInGarage().toArray(),toAdd.toArray());
	}
	
	@Test
	public void addMultipleVehicles_WorksForEmptyArray() {
		Garage operator = new Garage();
		ArrayList<Vehicle> toAdd = new ArrayList<Vehicle>();
		operator.addMultipleVehicles(toAdd);
		
		assertArrayEquals(operator.getVehiclesInGarage().toArray(),new Vehicle[0]);
	}
	
	@Test
	public void addMultipleVehicles_WorksForEmptyArrayAndCarsInGarage() throws Exception {
		Garage operator = new Garage();
		ArrayList<Vehicle> toAdd = new ArrayList<Vehicle>();
		
		ArrayList<Vehicle> toAdd2 = new ArrayList<Vehicle>();
		toAdd2.add(new Truck("B5632BM",600,400));
		toAdd2.add(new Car("B5462BA",3.0));	
		operator.addMultipleVehicles(toAdd2);
		
		operator.addMultipleVehicles(toAdd);
		
		assertArrayEquals(operator.getVehiclesInGarage().toArray(),toAdd2.toArray());
	}
	
	@Test
	public void AvaragefuelPer100Km_IsValid() throws Exception {
		Garage operator = new Garage();
		ArrayList<Vehicle> toAdd = new ArrayList<Vehicle>();
		
		toAdd.add(new Truck("B5662BM",500,250));
		toAdd.add(new Car("B5662BA",2.0));		
		operator.addMultipleVehicles(toAdd);
		
		assertEquals(operator.AvaragefuelPer100Km(),9.25,0);
	}
	
	@Test
	public void AvaragefuelPer100Km_IsValidIfNoCarsInGarage() {
		Garage operator = new Garage();
		
		assertEquals(operator.AvaragefuelPer100Km(),0,0);
	}
	
	@Test
	public void addVehicle_WorksForEmptyGarage() throws Exception {
		Garage operator = new Garage();
		Vehicle toAdd = new Truck("B5662BM",500,250);
		
		operator.addVehicle(toAdd);
		
		assertArrayEquals(operator.getVehiclesInGarage().toArray(),new Vehicle[]{toAdd});
	}
	
	@Test
	public void addVehicle_WorksIfVehiclesInGarage() throws Exception {
		Garage operator = new Garage();
		Vehicle toAdd = new Truck("B5662BM",500,250);
		ArrayList<Vehicle> toAdd2 = new ArrayList<Vehicle>();
		
		toAdd2.add(new Truck("B5632BM",600,400));
		toAdd2.add(new Car("B5462BA",3.0));	
		operator.addMultipleVehicles(toAdd2);
		
		operator.addVehicle(toAdd);
		toAdd2.add(toAdd);
		
		assertArrayEquals(operator.getVehiclesInGarage().toArray(),toAdd2.toArray());
	}

}
