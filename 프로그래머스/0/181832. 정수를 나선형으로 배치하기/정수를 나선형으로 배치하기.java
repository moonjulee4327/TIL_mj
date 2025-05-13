class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int num = 1;
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = n - 1;
        while(n * n >= num) {
            for(int i = startCol; i <= endCol; i++) {
                answer[startRow][i] = num++;
            }
            startRow++;
            for(int i = startRow; i <= endRow; i++) {
                answer[i][endCol] = num++;
            }
            endCol--;
            for(int i = endCol; i >= startCol; i--) {
                answer[endRow][i] = num++;
            }
            endRow--;
            for(int i = endRow; i >= startRow; i--) {
                answer[i][startCol] = num++;
            }
            startCol++;
        }
        
        return answer;
    }
}