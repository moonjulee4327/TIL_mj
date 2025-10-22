import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        int idx = sArr.length - 1;
        for(int i = 0; i < sArr.length / 2; i++) {
            char temp = sArr[i];
            sArr[i] = sArr[idx];
            sArr[idx--] = temp;
        }
        return String.valueOf(sArr);
    }
}