class Solution {
    public int solution(int balls, int share) {
        int n = balls;
        int r = share;

        r = Math.min(r, n - r);

        long result = 1L;
        for (int i = 1; i <= r; i++) {
            result = result * (n - r + i) / i;
        }

        return (int) result;
    }
}