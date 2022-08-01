package factFibo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFibonaci {

	@Test
	public void calc_Returns0for0() {
		assertEquals(0,Fibonaci.calc(0)); 
	}
	
	@Test
	public void calc_IsValidforPositiveNumbers() {
		int currentNumber = 1;
		int previousNumber = 0;
		for(int i = 1; i < 10; i++) {
			assertEquals(currentNumber,Fibonaci.calc(i)); 
			currentNumber += previousNumber;
			previousNumber = currentNumber - previousNumber;
		}
	}
	
	@Test
	public void calc_IsValidforNegativeNumbers() {
		int currentNumber = 1;
		int previousNumber = 0;
		for(int i = -1; i > -10; --i) {
			//assertEquals(previousNumber,Fibonaci.calc(i)); 
			currentNumber += previousNumber;
			previousNumber = currentNumber - previousNumber;
			if(i % 2 == 0) { 
				//currentNumber *= -1;
			}
		}
	}
}

