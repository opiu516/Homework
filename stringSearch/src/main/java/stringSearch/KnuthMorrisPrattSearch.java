package stringSearch;

public class KnuthMorrisPrattSearch implements StringSearch{

	public int positionOf(String part, String whole) {
		int M = part.length();
		if(M == 0) {
			return 0;
		}
		int N = whole.length();

		int lps[] = new int[M];
		int j = 0; 
		
		computeLPSArray(part, M, lps);
		
		int i = 0;
		while ((N - i) >= (M - j)) {
			if (part.charAt(j) == whole.charAt(i)) {
				j++;
				i++;
			}
			if (j == M) {
				return (i - j);
			}
		 
			else if (i < N && part.charAt(j) != whole.charAt(i)) {
				if (j != 0)
					j = lps[j - 1];
				else
					i = i + 1;
			}
		}
		
		return -1;
	}
		 
	private void computeLPSArray(String part, int M, int lps[]) {
		int len = 0;
		int i = 1;
		lps[0] = 0;
		
		while (i < M) {
			if (part.charAt(i) == part.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}
			else{
				if (len != 0) {
					len = lps[len - 1];
		 
				}
				else{
					lps[i] = len;
					i++;
				}
			}
		}
	}
}
