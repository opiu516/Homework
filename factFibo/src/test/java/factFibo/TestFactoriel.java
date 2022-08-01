package factFibo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactoriel {

	@Test
	public void calc_Returns1For0() {
		assertEquals(1,Factoriel.calc(0)); 
	}
	
	@Test
	public void calc_Returns1ForNegativeNumbers() {
		for(int i = -10; i < -1; i++) {
			assertEquals(1,Factoriel.calc(i)); 
		}
	}
	
	@Test
	public void calc_IsValidForPositiveNumbers() {
		int expected = 1;
		
		for(int i = 1; i < 10; i++) {
			expected *= i;
			assertEquals(expected,Factoriel.calc(i)); 
		}
	}


}
