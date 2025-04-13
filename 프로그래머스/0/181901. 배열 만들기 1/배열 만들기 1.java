import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i * k <= n; i++) {
            list.add(i * k);
        }
        int[] arr = new int[list.size()];
         for(int i = 0; i < list.size(); i++) {
             arr[i] = list.get(i);
         }
        return arr;
    }
}