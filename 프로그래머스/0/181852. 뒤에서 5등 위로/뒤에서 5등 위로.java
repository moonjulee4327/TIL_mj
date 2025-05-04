import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int idx = 5;
        int n = num_list.length - 5;
        int[] answer = new int[n];
        for(int i = 0; i < num_list.length - 5; i++) {
            answer[i] = num_list[idx++];
            System.out.print(answer[i] + " ");
        }
        return answer;
    }
}