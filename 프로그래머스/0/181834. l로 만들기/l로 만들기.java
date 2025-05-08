import java.util.*;

class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        char[] arr = myString.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if('l' > arr[i]) {
                arr[i] = 'l';
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}