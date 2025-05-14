class Solution {
    public int solution(int[][] dots) {
        int[] x = new int[4];
        int[] y = new int[4];

        for (int i = 0; i < 4; i++) {
            x[i] = dots[i][0];
            y[i] = dots[i][1];
        }

        if (isParallel(x[0], y[0], x[1], y[1], x[2], y[2], x[3], y[3])) return 1;
        if (isParallel(x[0], y[0], x[2], y[2], x[1], y[1], x[3], y[3])) return 1;
        if (isParallel(x[0], y[0], x[3], y[3], x[1], y[1], x[2], y[2])) return 1;

        return 0;
    }

    private boolean isParallel(int x1, int y1, int x2, int y2,int x3, int y3, int x4, int y4) {
        return (y2 - y1) * (x4 - x3) == (y4 - y3) * (x2 - x1);
    }
}