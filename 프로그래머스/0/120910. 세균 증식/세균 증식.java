class Solution {
    public int solution(int n, int t) {
        return doubleValue(n, t);
    }
    
    private int doubleValue(int n, int t) {
        if(t-- == 0) {
            return n;
        }
        return doubleValue(n, t) * 2;
    }
}