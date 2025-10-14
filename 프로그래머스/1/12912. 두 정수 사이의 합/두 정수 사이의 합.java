class Solution {
    public long solution(int a, int b) {
        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        // 등차수열의 합
        // (n(항의 개수) / 2) * (첫번째 항 + 두번째 항)
        return (long) (b - a + 1) * (a + b) / 2;
    }
}