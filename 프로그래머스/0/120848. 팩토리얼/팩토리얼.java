class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        
        while(n >= num) {
            num *= ++answer;
        }
        
        return n == num ? answer : answer - 1;
    }
}