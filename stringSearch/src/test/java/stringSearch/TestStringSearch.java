package stringSearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringSearch {

	@Test
	public void positionOf_ReturnsNegative1IfWordNotFound() {
		String whole = "abcdabd";
		String part[] = new String[] {"e","k","ej","AB","EA"};
		
		SimpleSearch engine1 = new SimpleSearch();
		KnuthMorrisPrattSearch engine2 = new KnuthMorrisPrattSearch();
		
		for(int i = 0;i < 5;i++) {
			assertArrayEquals(new int[] {
					engine1.positionOf(part[i], whole),
					engine2.positionOf(part[i], whole)},
					new int[] {-1,-1});
		}
	}
	
	@Test
	public void positionOf_ReturnsValidPositionOfWord() {
		String whole = "abcdabd";
		String part[] = new String[] {"a","b","ab","cd","dab"};
		int answers[] = new int[] {0,1,0,2,3};
		
		SimpleSearch engine1 = new SimpleSearch();
		KnuthMorrisPrattSearch engine2 = new KnuthMorrisPrattSearch();
		
		for(int i = 0;i < 5;i++) {
			assertArrayEquals(new int[] {
					engine1.positionOf(part[i], whole),
					engine2.positionOf(part[i], whole)},
					new int[] {answers[i],answers[i]});
		}
	}
	
	@Test
	public void positionOf_ReturnsNegative1IfNoSearchbleText() {
		String whole = "";
		String part = "abc";
		
		SimpleSearch engine1 = new SimpleSearch();
		KnuthMorrisPrattSearch engine2 = new KnuthMorrisPrattSearch();
		
		assertArrayEquals(new int[] {
				engine1.positionOf(part, whole),
				engine2.positionOf(part, whole)},
				new int[] {-1,-1});
	}	
	
	@Test
	public void positionOf_Returns0IfSearchingForEmptyText() {
		String whole = "abcdabd";
		String part = "";
		
		SimpleSearch engine1 = new SimpleSearch();
		KnuthMorrisPrattSearch engine2 = new KnuthMorrisPrattSearch();
		
		assertArrayEquals(new int[] {
				engine1.positionOf(part, whole),
				engine2.positionOf(part, whole)},
				new int[] {0,0});
	}

}
