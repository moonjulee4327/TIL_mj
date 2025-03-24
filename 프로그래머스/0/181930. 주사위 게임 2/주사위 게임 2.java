class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        int count = 1;
        
        if(a == b || b == c || c == a){
            count++;
        }
        
        if(a == b && b == c) {
            count++;
        }
        
        for(int i = 1; i <= count; i++) {
            answer *= (pow(a, i) + pow(b, i) + pow(c, i));
        }
        
        return answer;
    }
    
    private int pow(int base, int exponent) {
        if(exponent == 0) return 1;
        return base * pow(base, exponent - 1);
    }
}