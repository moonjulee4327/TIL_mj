import java.util.*; 

class Solution { 
    public String solution(String s) {
        int[] arr = new int[26];
        char[] cArr = s.toCharArray();
        
        Arrays.sort(cArr);
    
        for(int i = 0; i < cArr.length; i++) {
            arr[cArr[i] - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) sb.append((char) (i + 'a'));
        }
        
        return sb.toString();
    } 
}