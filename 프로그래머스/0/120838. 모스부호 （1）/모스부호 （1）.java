class Solution {
    private String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = letter.split(" ");
        
        for(String str : strArr) {
            for(int i = 0; i < morse.length; i++) {
                if(str.equals(morse[i])) sb.append(String.valueOf((char) ('a' + i)));
            }
        }
        
        return sb.toString();
    }
}