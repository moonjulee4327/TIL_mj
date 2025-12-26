class Solution {
    public int solution(int[] array, int n) {
        int near = 100;
        int idx = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(near > Math.abs(array[i] - n)) {
                near = Math.abs(array[i] - n);
                idx = i;
            }else if(near == Math.abs(array[i] - n)) {
                near = Math.abs(array[i] - n);
                idx = array[i] > array[idx] ? idx : i;
            }
        }
        
        return array[idx];
    }
}