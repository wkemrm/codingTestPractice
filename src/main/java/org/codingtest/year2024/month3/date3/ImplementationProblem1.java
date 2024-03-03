package org.codingtest.year2024.month3.date3;

public class ImplementationProblem1 {
    public void solve(int n, String[] input) {
        int minX = 1;
        int maxX = n;
        int minY = 1;
        int maxY = n;

        int currentX = 1;
        int currentY = 1;

        for (String direction : input) {
            switch (direction) {
                case "L" -> {
                    if (currentX != minX) {
                        currentX -= 1;
                    }
                }
                case "R" -> {
                    if (currentX != maxX) {
                        currentX += 1;
                    }
                }
                case "U" -> {
                    if (currentY != minY) {
                        currentY -= 1;
                    }
                }
                case "D" -> {
                    if (currentY != maxY) {
                        currentY += 1;
                    }
                }
            }
        }

        System.out.println(currentY);
        System.out.println(currentX);
    }
}
