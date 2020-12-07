public class MagicSqureSolution {

	public int getMinimumCost(int[][] input) {

		// Max possible sum
		int[] sum = new int[8];

		// All possible magic squares
		int[][] magicSquare0 = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };// 1
		int[][] magicSquare1 = { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } };// 2
		int[][] magicSquare2 = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };// 3
		int[][] magicSquare3 = { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } };// 4
		int[][] magicSquare4 = { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } };// 5
		int[][] magicSquare5 = { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } };// 6
		int[][] magicSquare6 = { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } };// 7
		int[][] magicSquare7 = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };// 8

		// traverse entire matrix and get all possible sum
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum[0] += Math.abs(input[i][j] - magicSquare0[i][j]);
				sum[1] += Math.abs(input[i][j] - magicSquare1[i][j]);
				sum[2] += Math.abs(input[i][j] - magicSquare2[i][j]);
				sum[3] += Math.abs(input[i][j] - magicSquare3[i][j]);
				sum[4] += Math.abs(input[i][j] - magicSquare4[i][j]);
				sum[5] += Math.abs(input[i][j] - magicSquare5[i][j]);
				sum[6] += Math.abs(input[i][j] - magicSquare6[i][j]);
				sum[7] += Math.abs(input[i][j] - magicSquare7[i][j]);
			}
		}

		// extract minimum sum
		int minCost = sum[0];
		for (int permutation = 1; permutation < 8; permutation++) {
			if (minCost > sum[permutation])
				minCost = sum[permutation];
		}

		return minCost;
	}
}