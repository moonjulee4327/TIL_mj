class Solution {
    private final int lambSkewers = 12000;
    private final int drinkCost = 2000;
    private final int serviceScope = 10;
    
    public int solution(int n, int k) {
        return (lambSkewers * n) + ((k - (n / serviceScope)) * drinkCost);
    }
}