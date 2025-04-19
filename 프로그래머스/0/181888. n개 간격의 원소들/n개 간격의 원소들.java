class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int idx = 0;
        for(int i = 0; i < num_list.length; i += n) {
            idx++;
        }
        
        answer = new int[idx];
        for(int i = 0; i < idx; i++) {
            answer[i] = num_list[i * n];
        }
        
        return answer;
    }
}