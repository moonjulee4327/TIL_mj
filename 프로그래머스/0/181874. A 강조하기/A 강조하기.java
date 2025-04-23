class Solution {
    public String solution(String myString) {
        char[] answer = myString.toCharArray();
        for(int i = 0; i < answer.length; i++) {
            if(answer[i] == 'a' || answer[i] == 'A') {
                answer[i] = Character.toUpperCase(answer[i]);
            }else {
                answer[i] = Character.toLowerCase(answer[i]);
            }
        }
        return new String(answer);
    }
}