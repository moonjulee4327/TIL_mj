class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            answer[c >= 'a' ? c - 'a' + 26: c - 'A'] += 1;
        }
        return answer;
    }
}