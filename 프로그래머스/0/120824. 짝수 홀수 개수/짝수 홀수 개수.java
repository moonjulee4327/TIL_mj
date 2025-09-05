import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        long evenCount = Arrays.stream(num_list)
            .filter(n -> n % 2 == 0)
            .count();

        return new int[] {(int) evenCount, (int) (num_list.length - evenCount)};
    }
}