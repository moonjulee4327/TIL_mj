import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(int i = 0; i < score.length; i++) {
            arr.add(score[i]);
            arr.sort(Comparator.reverseOrder());
            if(k > i) {
                temp.add(arr.get(i));
            }else {
                temp.add(arr.get(k - 1));
            }
        }
        
        int[] answer = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}