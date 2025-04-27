import java.util.*;

class Solution {
    public String[] solution(String myString) {
        myString = myString.replaceAll(" ", "");
        System.out.println(myString);
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        
        int count = answer.length;
        for(int i = 0; i < answer.length; i++) {
            if(answer[i].equals("")) {
                count--;
            }
        }
        
        int idx = 0;
        String[] arr = new String[count];
        for(int i = 0; i < answer.length; i++) {
            if(!answer[i].equals("")) {
                arr[idx++] = answer[i];
            }
        }
        
        return arr;
    }
}