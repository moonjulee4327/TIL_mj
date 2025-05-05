import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                map.put(rank[i], i);
            }
        }
        
        int n = 3;
        int idx = 0;
        int[] studentIdx = new int[n];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(n > idx) {
                studentIdx[idx++] = entry.getValue();
            }
        }

        return (10000 * studentIdx[0]) + (100 * studentIdx[1]) + studentIdx[2];
    }
}