class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] numList = num_str.split("");
        for(int i = 0; i < numList.length; i++) {
            answer += Integer.parseInt(numList[i]);
        }
        return answer;
    }
}