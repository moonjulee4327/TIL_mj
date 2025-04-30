class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        for(int num : arr) {
            length += num;
        }
        int[] answer = new int[length];
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}