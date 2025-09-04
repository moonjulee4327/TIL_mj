class Solution {
    public int solution(int n) {
        int answer = 0;
        int even = 2;
        while(n >= even) {
            answer += even;
            even += 2;
        }
        return answer;
    }
}