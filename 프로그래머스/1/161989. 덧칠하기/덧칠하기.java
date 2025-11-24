class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int p = 0;
        
        for(int s : section) {
            if(s > p) {
                p = s + m - 1;
                answer++;
            }
        }
        
        return answer;
    }
}
