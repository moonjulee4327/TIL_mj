import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        int[] arr1 = arr;
        int[] arr2 = arr;
        int[] temp = arr;
        
        do{
            temp = Arrays.copyOf(arr2, arr.length);
            for(int i = 0; i < arr.length; i++) {
                if(arr2[i] >= 50 && arr2[i] % 2 == 0) {
                    arr2[i] = arr2[i] / 2;
                }else if(arr2[i] < 50 && arr2[i] % 2 != 0) {
                    arr2[i] = arr2[i] * 2 + 1;
                }
            }
            arr1 = Arrays.copyOf(temp, arr.length);
            answer++;
        }while(!Arrays.equals(arr1, arr2));
        
        return answer;
    }
}