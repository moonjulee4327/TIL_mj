class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 1; i <= myString.length(); i++) {
            String str = myString.substring(0, i);
            if(str.endsWith(pat)) {
                answer++;
            }
        }
        return answer;
    }
}