package org.codingtest.year2024.month3.date3;

public class ImplementationProblem2 {

    public void solve(int input) {
        int result = 0;
        for (int time = 0 ; time <= input ; time++) {
            for (int minute = 0 ; minute <= 59 ; minute++) {
                for (int second = 0 ; second <= 59 ; second++) {
                    String s = Integer.toString(time) + Integer.toString(minute) + Integer.toString(second);
                    if (s.contains("3")) {
                        result++;
                    };
                }
            }
        }
        System.out.println(result);
    }

}
