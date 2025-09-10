

class Solution {
    public int solution(int[] sides) {
        int sum = 0;
        int max = 0;
        for(int side : sides) {
            sum += side;
            if(side > max) {
                max = side;
            }
        }
        
        return (sum - max) > max ? 1 : 2;
    }
}