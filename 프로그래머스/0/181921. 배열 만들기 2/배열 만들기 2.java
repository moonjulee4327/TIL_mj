import java.util.stream.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = IntStream.range(l, r + 1).filter(n -> isOnlyZeroOrFiveNum(n)).toArray();
        
        return answer.length == 0 ? new int[]{-1} : answer;
    }
    
    private boolean isOnlyZeroOrFiveNum(int num) {
        String str = String.valueOf(num);
        for(char c : str.toCharArray()) {
            if(c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
}