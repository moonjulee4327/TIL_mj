import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = arr;
        if(arr.length != arr[0].length) {
            if(arr.length > arr[0].length) {
                answer = new int[arr.length][arr.length];
            }else {
                answer = new int[arr[0].length][arr[0].length];
            }
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    answer[i][j] = arr[i][j];
                }    
            }
        }
        return answer;
    }
}