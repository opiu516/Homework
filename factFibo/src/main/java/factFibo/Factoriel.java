package factFibo;

public class Factoriel {
	static public int calc(int number) {
		int result = 1;
		for(;number > 1; --number) {
			result *= number;
		}
		return result;
	}
}
