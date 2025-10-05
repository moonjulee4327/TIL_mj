import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] nStrArr = String.valueOf(n).split("");
        for(String nStr : nStrArr) {
            answer += Integer.parseInt(nStr);
        }
        return answer;
    }
}