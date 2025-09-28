import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int length = numbers.length;
        Arrays.sort(numbers);
        return numbers[length - 1] * numbers[length - 2] >= numbers[0] * numbers[1] ? numbers[length - 1] * numbers[length - 2] : numbers[0] * numbers[1];
    }
}