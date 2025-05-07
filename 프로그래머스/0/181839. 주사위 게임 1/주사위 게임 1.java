class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a % 2 != 0 && b % 2 != 0) {
            answer = (a * a) + (b * b);
        }else if(a % 2 == 0 && b % 2 == 0) {
            answer = a - b > 0 ? a - b : (a - b) * -1;
        }else {
            answer = 2 * (a + b);
        }
        
        return answer;
    }
}