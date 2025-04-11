class Solution {
    public String solution(String my_string, int s, int e) {
        char[] charArr = my_string.toCharArray();
        
        while(s < e) {
            char temp = charArr[s];
            charArr[s++] = charArr[e];
            charArr[e--] = temp;
        }
        
        return new String(charArr);
    }
}