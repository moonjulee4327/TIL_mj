class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] nStrArr = (n + "").split("");
        for(String nStr : nStrArr) {
            answer += Integer.parseInt(nStr);
        }
        return answer;
    }
}