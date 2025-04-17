import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        for(int[] interval : intervals) {
            for(int i = interval[0]; i <= interval[1]; i++) {
                list.add(arr[i]);
            }
        }
        
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}