import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        Arrays.sort(wallet);
        Arrays.sort(bill);
        
        while(bill[0] > wallet[0] || bill[1] > wallet[1]) {
            bill[1] /= 2;
            Arrays.sort(bill);
            answer++;
        }
        
        return answer;
    }
}