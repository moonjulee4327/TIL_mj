class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] numArr = number.split("");
        for(String num : numArr) {
            int n = Integer.parseInt(num);
            answer += n;
        }
        return answer % 9;
    }
}