package org.codingtest.year2024.month3.date3;

public class GreedyProblem3 {
    public int solve(int n, int k) {
        int result = 0;

        while (true) {
            if (n == 1) {
                break;
            }
            if (n % k == 0) {
                n /= k;
                result++;
            } else {
                n -= 1;
                result++;
            }
        }
        return result;
    }
}
