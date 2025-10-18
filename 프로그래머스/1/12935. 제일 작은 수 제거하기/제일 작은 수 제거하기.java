class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(min == arr[i]) {
                continue;
            }
            answer[idx++] = arr[i];
        }
        return arr.length == 1 ? new int[] {-1} : answer;
    }
}