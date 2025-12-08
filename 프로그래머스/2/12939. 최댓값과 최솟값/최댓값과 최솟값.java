import java.util.*;

class Solution {
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;
    
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.split(" ");
        
        for(String str : split) {
            max = Math.max(Integer.parseInt(str), max);
            min = Math.min(Integer.parseInt(str), min);
        }
        
        return sb.append(min).append(" ").append(max).toString();
    }
}