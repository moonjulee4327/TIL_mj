class Solution {
    public String solution(String bin1, String bin2) {
        int i = Integer.parseInt(bin1, 2);
        int j = Integer.parseInt(bin2, 2);
        
        return Integer.toBinaryString(i + j);
    }
}