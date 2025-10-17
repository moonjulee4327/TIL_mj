import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int idx = 0;
        for(int i : arr) {
            if(i % divisor == 0) {
                idx++;
            }
        }
        
        if(idx == 0) {
            return new int[] {-1};
        }
        
        int[] idxArr = new int[idx];
        idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                idxArr[idx++] = i;
            }
        }
        
        int[] answer = new int[idx];
        for(int i = 0; i < idx; i++) {
            answer[i] = arr[idxArr[i]];
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}