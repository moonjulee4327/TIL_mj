class Solution {
    public int[] solution(int[] array) {
        int maxVal = 0;
        int maxIdx = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > maxVal) {
                maxVal = array[i];
                maxIdx = i;
            }
        }
        return new int[] {
            maxVal, maxIdx
        };
    }
}