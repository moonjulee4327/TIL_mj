class Solution {
    public int solution(String myString, String pat) {
        char[] charArr = myString.toCharArray();
        
        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] == 'A') {
                charArr[i] = 'B';
            }else if(charArr[i] == 'B') {
                charArr[i] = 'A';
            }
        }
        
        return new String(charArr).contains(pat) ? 1 : 0;
    }
}