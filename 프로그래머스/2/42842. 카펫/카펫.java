class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for(int h = 3; h * h <= sum; h++) {
            if(sum % h != 0) continue;
            
            int w = sum / h;
            
            if(yellow == (h - 2) * (w - 2)) {
                answer[0] = w;
                answer[1] = h;
                break;
            }
        }
        
        return answer;
    }
}