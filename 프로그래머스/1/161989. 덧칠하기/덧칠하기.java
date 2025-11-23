class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paintedEnd = 0; 

        for (int pos : section) {
            if (pos > paintedEnd) {
                answer++;
                paintedEnd = pos + m - 1;
            }
        }

        return answer;
    }
}
