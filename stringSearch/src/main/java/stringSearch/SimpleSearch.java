package stringSearch;

public class SimpleSearch implements StringSearch{

	public int positionOf(String part, String whole) {
		if(part.isEmpty()) {
			return 0;
		}
		if(whole.isEmpty()) {
			return -1;
		}
		int partLenght = part.length();
		for(int i = 0;i < whole.length()-partLenght;i++) {
			if(whole.substring(i,i+partLenght).equals(part)) {
				return i;
			}
		}
		
		return -1;
	}

}
