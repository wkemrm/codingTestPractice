package org.codingtest.year2024.month3.date3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GreedyProblem1 {
    public int solve(int n, int maxCount, int continualAddCount, int[] inputData) {
        int result = 0;
        List<Integer> listInputData = Arrays.stream(inputData)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int first = listInputData.get(0);
        int second = listInputData.get(1);
        int count = 0;

        while (true) {
            if (count == maxCount) {
                break;
            }
            for (int i = 0 ; i < continualAddCount ; i++) {
                result += first;
                count++;
            }
            result += second;
            count++;
        }

        return result;
    }
}
