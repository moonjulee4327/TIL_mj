import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(n >= 3) {
            arr.add(n % 3);
            n /= 3;
        }
        arr.add(n);
        
        int arrIdx = arr.size() - 1;
        for(int i = 0; i < arr.size(); i++) {
            answer += Math.pow(3, arrIdx--) * arr.get(i);
        }
        return answer;
    }
}