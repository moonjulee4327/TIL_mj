class Solution {
    public int solution(int[] sides) {
        int a = Math.min(sides[0], sides[1]);
        return 2 * a - 1;
    }
}