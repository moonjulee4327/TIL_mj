class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int n = myString.lastIndexOf(pat);
        answer = myString.substring(0, n) + pat;
        return answer;
    }
}