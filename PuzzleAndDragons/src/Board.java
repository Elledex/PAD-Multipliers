import java.util.Random;
import static org.junit.Assert.*;

public class Board {
	private boolean exactlyThreeColorsPossible;
	private boolean exactlyFourColorsPossible;
	private int numColorsPossible = 0;
	private int numCombosPossible = 0;
	private int[] orbs = {0,0,0,0,0};
	private int numHearts = 0;
	private int numDoubles = 0;
	private int numSingles = 0;
	
	/**
	 * Creates a board, number of orbs stored in a int[6]
	 * orbs[5] is the number of hearts
	 * @param numColors number of colors in the dungeon
	 * @param hearts whether or not there are hearts in the dungeon
	 */
	public Board(int numColors, boolean hearts) {
		
		int allColors = numColors + (hearts?1:0);

		if (hearts) {
			assertEquals(numColors+1, allColors);
		} else {
			assertEquals(numColors, allColors);
		}
		Random random = new Random();
		for (int i = 0; i < 30; i++) {
			int color = random.nextInt(allColors);
			if (hearts) {
				if (color != allColors-1) {
					orbs[color]++;
				} else {
					numHearts++;
				}
			} else {
				orbs[color]++;
			}
		}
		for (int i = 0; i < 5; i++) {
			numColorsPossible += orbs[i]>2?1:0;
			numCombosPossible += orbs[i]/3;
			if (i == 2) {
				if (numColorsPossible == 3) {
					exactlyThreeColorsPossible = true;
				} else {
					exactlyThreeColorsPossible = false;
				}
			}
			if (i == 3) {
				if (numColorsPossible == 4) {
					exactlyFourColorsPossible = true;
				} else {
					exactlyFourColorsPossible = false;
				}
			}
			if (orbs[i]%3 == 2) {
				numDoubles++;
			}
			if (orbs[i]%3 == 1) {
				numSingles++;
			}
		}
		
		assertTrue(numDoubles + numSingles <= 6);
		numCombosPossible += numHearts/3;	
	}
	
	/**
	 * Last integer is number of hearts
	 * @return a string of 6 integers delimited by spaces - number of orbs per color
	 */
	public String getBoard() {
		return Integer.toString(orbs[0]) + " " + 
			   Integer.toString(orbs[1]) + " " + 
			   Integer.toString(orbs[2]) + " " +
			   Integer.toString(orbs[3]) + " " + 
			   Integer.toString(orbs[4]) + " " +
			   Integer.toString(numHearts);  
	}
	
	/**
	 * 
	 * @return number of colors (not hearts) with at least three orbs
	 */
	public int getNumColorsPossible() {
		return numColorsPossible;
	}
	
	/**
	 * 
	 * @return 1 if at least three hearts, 0 otherwise
	 */
	public int heartsPossible() {
		return numHearts>2?1:0;
	}
	
	/**
	 * 
	 * @return number of combos possible
	 */
	public int getNumCombosPossible() {
		return numCombosPossible;
	}
	
	/**
	 * 
	 * @return true if exactly the first three colors have at least three orbs each
	 */
	public boolean isChinesePossible() {
		return exactlyThreeColorsPossible;
	}

	/**
	 * 
	 * @return true if exactly the first four colors have at least three orbs each
	 */
	public boolean isKirinOrUmiYamaPossible() {
		return exactlyFourColorsPossible;
	}
	
	/**
	 * 
	 * @return number of colors with two leftover orbs
	 */
	public int getNumDoubles() {
		return numDoubles;
	}
	
	/**
	 * 
	 * @return number of colors with one leftover orb
	 */
	public int getNumSingles() {
		return numSingles;
	}
}