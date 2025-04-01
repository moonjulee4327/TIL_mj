class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x5 = true;
        boolean x6 = true;
        
        if(x1 == false && x2 == false) {
            x5 = false;
        }
        
        if(x3 == false && x4 == false) {
            x6 = false;
        }
        
        if(x5 == false || x6 == false) {
            answer = false;
        }
        
        return answer;
    }
}