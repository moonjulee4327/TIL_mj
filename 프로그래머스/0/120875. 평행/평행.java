class Solution {
    public int solution(int[][] dots) {
        double slope1, slope2;

        slope1 = getSlope(dots[0], dots[1]);
        slope2 = getSlope(dots[2], dots[3]);
        if (slope1 == slope2) return 1;

        slope1 = getSlope(dots[0], dots[2]);
        slope2 = getSlope(dots[1], dots[3]);
        if (slope1 == slope2) return 1;

        slope1 = getSlope(dots[0], dots[3]);
        slope2 = getSlope(dots[1], dots[2]);
        if (slope1 == slope2) return 1;

        return 0;
    }

    private double getSlope(int[] a, int[] b) {
        if (a[0] == b[0]) return Double.POSITIVE_INFINITY;
        return (double)(a[1] - b[1]) / (a[0] - b[0]);
    }
}