import java.util.*;

class Solution {
    public int solution(int[] array) {
        int median = array.length / 2;
        Arrays.sort(array);
        return array[median];
    }
}