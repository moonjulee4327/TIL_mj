class Solution {
    public int[] solution(int n) {
        int length = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                length++;
            }
        }
        int[] answer = new int[length];
        for(int i = n; i >= 1; i--) {
            if(n % i == 0) {
                answer[--length] = i;
            }
        }
        return answer;
    }
}