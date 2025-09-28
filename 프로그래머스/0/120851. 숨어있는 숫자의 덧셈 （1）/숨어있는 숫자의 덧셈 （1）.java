class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] arr = my_string.replaceAll("[a-z|A-Z]", "").toCharArray();
        for(char c : arr) {
            answer += (int) c - '0';
        }
        return answer;
    }
}