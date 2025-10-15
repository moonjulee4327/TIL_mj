class Solution {
    boolean solution(String s) {
        char[] sArr = s.toCharArray();
        int pCount = 0;
        int yCount = 0;
        for(char c : sArr) {
            if(c == 'p' || c == 'P') pCount++;
            if(c == 'y' || c == 'Y') yCount++;
        }
        return pCount == yCount ? true : false;
    }
}