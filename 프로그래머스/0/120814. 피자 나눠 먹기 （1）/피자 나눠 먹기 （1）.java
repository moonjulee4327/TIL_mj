class Solution {
    private final int PIZZA_PIECE = 7;
    
    public int solution(int n) {
        return n % PIZZA_PIECE == 0 ? (n / PIZZA_PIECE) : (n / PIZZA_PIECE + 1);
    }
}