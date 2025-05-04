import java.util.stream.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int length = Integer.compare(arr1.length, arr2.length);
        return length == 0 ? Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum()) : length > 0 ? 1 : -1;
    }
}