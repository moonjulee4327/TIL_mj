class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        answer = ((price + ((long) price * count)) * count / 2) - money;
        return answer >= 0 ? answer : 0;
    }
}