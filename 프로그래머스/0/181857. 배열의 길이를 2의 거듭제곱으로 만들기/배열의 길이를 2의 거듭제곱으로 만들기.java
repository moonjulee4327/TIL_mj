class Solution {
    public int[] solution(int[] arr) {
        int idx = 0;
        for(int i = 1; i <= 1024; i *= 2) {
            if(i >= arr.length) {
                idx = i;
                break;
            }
        }
        
        int[] answer = new int[idx];
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}