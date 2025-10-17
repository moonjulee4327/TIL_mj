class Solution {
    public int solution(int num) {
        int answer = -1;
        long longNum = (long) num;
        for(int i = 0; i < 500; i++) {
            if(longNum == 1) {
                answer = i;
                break;
            }
            
            if(longNum % 2 == 0) {
                longNum /= 2;
            }else {
                longNum = (longNum * 3) + 1;
            }
        }
        return answer;
    }
}