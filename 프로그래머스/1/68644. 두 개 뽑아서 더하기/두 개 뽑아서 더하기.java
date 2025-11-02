import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(i == j) {
                    continue;
                }else {
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }
        
        int[] answer = new int[set.size()];
        int i = 0;
        for(Integer s : set) {
            answer[i++] = s;
        }
        
        return answer;
    }
}