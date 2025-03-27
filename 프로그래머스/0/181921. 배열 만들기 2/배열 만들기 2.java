import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<String> numList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int[] answer = null;
        
        for(int i = l; i <= r; i++) {
            numList.add(i + "");
        }
        
        for(int i = 0; i < numList.size(); i++) {
            String[] numArr = numList.get(i).split("");
            boolean flag = false;
            for(int j = 0; j < numArr.length; j++) { 
                if(numArr[j].equals("0") || numArr[j].equals("5")) {
                    flag = true;
                }else {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                result.add(Integer.parseInt(numList.get(i)));
            }else {
                continue;
            }
        }
        
        if(result.size() == 0) {
            result.add(-1);
        }
        
        answer = new int[result.size()];
        
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);    
        }
        
        return answer;
    }
}