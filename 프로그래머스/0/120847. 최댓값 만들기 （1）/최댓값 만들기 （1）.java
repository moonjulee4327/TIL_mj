import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        numbers = Arrays.stream(numbers)
            .sorted()
            .toArray();
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}