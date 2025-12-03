import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sArr = s.split(" ");
        int[] sIntArr = new int[sArr.length];
        
        for(int i = 0; i < sArr.length; i++) {
            sIntArr[i] = Integer.parseInt(sArr[i]);
        }
        
        Arrays.sort(sIntArr);

        sb.append(sIntArr[0]);
        sb.append(" ");
        sb.append(sIntArr[sIntArr.length - 1]);
        
        return sb.toString();
    }
}