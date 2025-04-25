class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for(int i = 1; i <= myString.length(); i++) {
            String s = myString.substring(0, i);
            if(s.endsWith(pat)) {
                answer = s;
            }
        }
        return answer;
    }
}