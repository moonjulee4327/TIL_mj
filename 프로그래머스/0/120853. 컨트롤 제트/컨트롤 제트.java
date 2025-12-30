import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        // 공식문서에서 stack을 사용할 때 Deque의 구현체를 사용하길 추천함!
        Deque<String> deque = new ArrayDeque<>();
        
        for(String str : s.split(" ")) {
            if(str.equals("Z")) {
                deque.pop();
            }else {
                deque.push(str);
            }
        }
        
        for(String str : deque) {
            answer += Integer.parseInt(str);
        }
        
        return answer;
    }
}