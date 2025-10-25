import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(arr1.get(arr1.size() - 1) != arr[i]) {
                arr1.add(arr[i]);
            }
        }
        
        Object[] arr2 = arr1.toArray();
        int[] answer = new int[arr2.length];
        for(int i = 0; i < arr2.length; i++) {
            answer[i] = (int) arr2[i];
        }

        return answer;
    }
}