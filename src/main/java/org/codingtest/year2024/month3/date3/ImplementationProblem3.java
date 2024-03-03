package org.codingtest.year2024.month3.date3;

public class ImplementationProblem3 {
    public void solve(String currentLocation) {
        int currentLocationX = currentLocation.charAt(0) - 'a';
        Integer currentLocationY = currentLocation.charAt(1) - '1';

        int[][] direction = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};

        int result = 0;
        for (int[] array : direction) {
            int moveX = array[0];
            int moveY = array[1];
            if (currentLocationX + moveX >= 0 && currentLocationX + moveX < 8
                    && currentLocationY + moveY >= 0 && currentLocationY + moveY < 8) {
                result++;
            }
        }

        System.out.println(result);
    }
}
