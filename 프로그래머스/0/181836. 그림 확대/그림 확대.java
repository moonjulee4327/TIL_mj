import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        char[] arr = {};
        StringBuilder sb = null;
        int idx = 0;
        for(int i = 0; i < picture.length; i++) {
            arr = picture[i].toCharArray();
            sb = new StringBuilder();
            for(int j = 0; j < arr.length; j++) {
                for(int z = 0; z < k; z++) {
                    sb.append(arr[j]);
                }
            }
            for(int z = 0; z < k; z++) {
                answer[idx++] = sb.toString();
            }
        }
        
        return answer;
    }
}