import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] sArr = s.split(" ");
        Stack<String> stack = new Stack<>();
        
        for(String str : sArr) {
            if(str.equals("Z")) {
                stack.pop();
            }else {
                stack.push(str);
            }
        }
        
        for(String str : stack) {
            answer += Integer.parseInt(str);
        }
        
        return answer;
    }
}