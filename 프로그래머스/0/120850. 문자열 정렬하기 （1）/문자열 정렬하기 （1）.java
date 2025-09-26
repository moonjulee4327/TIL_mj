import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        List<Integer> list = new ArrayList();
        char[] arr = my_string.toCharArray();
        for(char c : arr) {
            if(c >= '0' && c <= '9') {
                list.add((int) c - 48);
            }
        }
        Collections.sort(list);
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}