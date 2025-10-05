class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        String[] reverseNStrArr = sb.reverse().toString().split("");
        int[] answer = new int[reverseNStrArr.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(reverseNStrArr[i]);
        }
        return answer;
    }
}