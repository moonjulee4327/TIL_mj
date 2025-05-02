import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        for(int i = 0; i < k; i++) {
            answer[i] = -1;
        }
        
        Set<Integer> set = new LinkedHashSet<Integer>();
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        
        Iterator<Integer> iterator = set.iterator();
        int idx = 0;
        while (iterator.hasNext() && idx < k) {
            answer[idx++] = iterator.next();
        }
        
        return answer;
    }
}