class Solution {
    public int solution(int[] numbers, int k) {
        int n = numbers.length;
        int idx = ((k - 1) * 2) % n;
        return numbers[idx];
    }
}