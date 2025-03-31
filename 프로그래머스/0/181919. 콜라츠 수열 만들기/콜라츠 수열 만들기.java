import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        return IntStream.concat(
            IntStream.iterate(n, i -> i > 1, i -> i % 2 == 0 ? i / 2 : 3 * i + 1),
            IntStream.of(1)
        ).toArray();
    }
}