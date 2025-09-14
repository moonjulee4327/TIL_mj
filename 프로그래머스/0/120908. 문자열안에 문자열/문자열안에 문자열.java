class Solution {
    public int solution(String str1, String str2) {
        int idx = 0;
        int length1 = str1.length();
        int length2 = str2.length();
        while(length1 - 1 >= idx + length2 - 1) {
            if(str1.substring(idx, idx + length2).equals(str2)) return 1;
            idx++;
        }
        return 2;
    }
}