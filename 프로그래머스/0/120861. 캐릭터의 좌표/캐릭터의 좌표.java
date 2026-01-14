class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0, y = 0;

        int maxX = board[0] / 2;
        int maxY = board[1] / 2;

        for (String key : keyinput) {
            int nx = x, ny = y;

            switch (key) {
                case "up":    ny++; break;
                case "down":  ny--; break;
                case "left":  nx--; break;
                case "right": nx++; break;
            }

            if (nx >= -maxX && nx <= maxX && ny >= -maxY && ny <= maxY) {
                x = nx;
                y = ny;
            }
        }

        return new int[]{x, y};
    
    }
}