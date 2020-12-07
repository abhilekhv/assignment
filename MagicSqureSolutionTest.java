import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MagicSqureSolutionTest {
	
	@Test
	void test() {		
		MagicSqureSolution magicSqureSolution =  new MagicSqureSolution();

		int[][] input = { { 5, 3, 4 }, { 1, 5, 8 }, { 6, 4, 2 } };
		int[][] input1 = { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } };
		int[][] input3 = { { 5, 8, 9 }, { 1, 5, 3 }, { 6, 4, 2 } };
		int[][] input4 = { { 1, 3, 6 }, { 4, 1, 8 }, { 9, 6, 3 } };
		int[][] input5 = { { 6, 7, 8 }, { 2, 6, 5 }, { 3, 4, 9 } };
		
		
		 assertEquals(7, magicSqureSolution.getMinimumCost(input));
		 assertEquals(0, magicSqureSolution.getMinimumCost(input1));
		 assertEquals(20, magicSqureSolution.getMinimumCost(input3));
		 assertEquals(22, magicSqureSolution.getMinimumCost(input4));
		 assertEquals(21, magicSqureSolution.getMinimumCost(input5));
	}

}
