class Solution {
    public int solution(int[][] dots) {
        double line1, line2;

        line1 = getLean(dots[0], dots[1]);
        line2 = getLean(dots[2], dots[3]);
        if (line1 == line2) return 1;

        line1 = getLean(dots[0], dots[2]);
        line2 = getLean(dots[1], dots[3]);
        if (line1 == line2) return 1;

        line1 = getLean(dots[0], dots[3]);
        line2 = getLean(dots[1], dots[2]);
        if (line1 == line2) return 1;

        return 0;
    }

    private double getLean(int[] coordinate1, int[] coordinate2) {
        if (coordinate1[0] == coordinate2[0]) return Double.POSITIVE_INFINITY;
        return (double)(coordinate1[1] - coordinate2[1]) / (coordinate1[0] - coordinate2[0]);
    }
}