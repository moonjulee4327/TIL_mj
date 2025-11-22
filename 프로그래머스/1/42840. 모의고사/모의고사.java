import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] answers) {
        int[][] patterns = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            int correct = answers[i];
            for (int p = 0; p < patterns.length; p++) {
                int[] pattern = patterns[p];
                if (correct == pattern[i % pattern.length]) {
                    scores[p]++;
                }
            }
        }

        int max = Arrays.stream(scores).max().getAsInt();

        return IntStream.range(0, 3)
                .filter(i -> scores[i] == max)
                .map(i -> i + 1)
                .toArray();
    }
}