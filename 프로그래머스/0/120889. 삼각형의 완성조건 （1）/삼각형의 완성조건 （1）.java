class Solution {
    public int solution(int[] sides) {
        int numSum = 0;
        int maxIdx = 0;
        for(int i = 1; i < sides.length; i++) {
            if(sides[i] > sides[maxIdx]) {
                maxIdx = i;
            }
        }
        for(int i = 0; i < sides.length; i++) {
            if(i == maxIdx) continue;
            numSum += sides[i];
        }
        return numSum > sides[maxIdx] ? 1 : 2;
    }
}