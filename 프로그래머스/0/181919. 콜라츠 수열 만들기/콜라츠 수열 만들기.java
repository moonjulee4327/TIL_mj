import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        collatz(n, answer);
        return answer.stream().mapToInt(i -> i).toArray();
    }
    
    private void collatz(int n, List<Integer> answer) {
        answer.add(n);
        
        if(n == 1) return;
        
        if(n % 2 == 0) {
            collatz(n / 2, answer);
        }else {
            collatz(3 * n + 1, answer);
        }
    }
}