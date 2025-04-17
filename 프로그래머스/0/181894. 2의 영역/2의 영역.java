class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int frontIdx = -1;
        int backIdx = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2 && frontIdx == -1) {
                frontIdx = i; 
            }else if(arr[i] == 2 && frontIdx != -1) {
                backIdx = i;
            }else {
                continue;
            }
        }
        if(frontIdx == -1 && backIdx == -1) {
            answer = new int[]{-1};
        }else if(frontIdx != -1 && backIdx == -1) {
            answer = new int[]{2};
        }else {
            int idx = 0;
            answer = new int[backIdx - frontIdx + 1];
            for(int i = frontIdx; i <= backIdx; i++) {
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}