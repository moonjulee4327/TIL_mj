class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : String.valueOf(age).toCharArray()) {
            c = (char) ('a' + c - '0');
            sb.append(c);
        }
        
        return sb.toString();
    }
}