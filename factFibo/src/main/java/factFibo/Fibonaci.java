package factFibo;

public class Fibonaci {
	public static int calc(int n) {
		int offset = 1;
		if(n < 0) {
			offset = -1;
		}
		n = Math.abs(n);
		int currentNumber = 1;
		int previousNumber = 0;
		for(int i = 0; i < n;i++) {
			currentNumber += previousNumber;
			previousNumber = currentNumber - previousNumber;
		}
		if(n % 2 == 0) {
			previousNumber *= offset;
		}
		return previousNumber;
	}
}
