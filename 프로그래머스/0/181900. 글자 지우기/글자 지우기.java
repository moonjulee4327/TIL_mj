class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        char[] charArr = my_string.toCharArray();
        for(int i : indices) {
            charArr[i] = ' ';
        }
        for(char c : charArr) {
            if(c != ' ') answer.append(c);
        }
        return answer.toString();
    }
}