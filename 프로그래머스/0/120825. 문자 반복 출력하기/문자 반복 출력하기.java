class Solution {
    public String solution(String my_string, int n) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < my_string.length(); i++) {
            for(int j = 0; j < n; j++) {
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}