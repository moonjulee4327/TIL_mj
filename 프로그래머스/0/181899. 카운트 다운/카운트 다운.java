class Solution {
    public int[] solution(int start_num, int end_num) {
        int idx = start_num - end_num;
        int[] answer = new int[idx + 1];
        for(int i = 0; i <= idx; i++) {
            answer[i] = start_num - i;
        }
        return answer;
    }
}