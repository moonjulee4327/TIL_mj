class Solution {
    public int[] solution(int n, int m) {
        if(n > m) {
            int temp = n;
            n = m;
            m = temp;
        }
        
        int gcf = 0;
        for(int i = 1; i <= m; i++) {
            if(n % i == 0 && m % i == 0) {
                gcf = i;
            }
        }
        
        return new int[] {gcf, n * m / gcf};
    }
}