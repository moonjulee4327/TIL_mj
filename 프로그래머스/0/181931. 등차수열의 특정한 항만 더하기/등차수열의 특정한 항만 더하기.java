class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        int idx = 0;
        
        for(int i = a; idx < included.length; i += d) {
            if(included[idx++]) {
                sum += i;
            }
        }
        
        return sum;
    }
}