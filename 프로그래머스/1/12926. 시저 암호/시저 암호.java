class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()) {
            if(c == ' ') {
                sb.append(' ');
            }else if(Character.isUpperCase(c)) {
                sb.append((char) ('A' + (c + n - 'A') % 26));
            }else {
                sb.append((char) ('a' + (c + n - 'a') % 26));
            }
        }
        
        return sb.toString();
    }
}