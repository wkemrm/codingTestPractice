package org.codingtest.year2024.month3.date3;

import java.util.Arrays;

public class GreedyProblem2 {
    public int solve(int m, int n, int[][] input) {
        int maxNumber = Integer.MIN_VALUE;
        for (int[] row : input) {
            int minNumber = Arrays.stream(row).min().getAsInt();

            if (maxNumber < minNumber) {
                maxNumber = minNumber;
            }
        }

        return maxNumber;
    }
}
