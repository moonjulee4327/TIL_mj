class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        String[] xArr = String.valueOf(x).split("");
        String xStr = String.valueOf(x);
        for(int i = xArr.length - 1; i >= 0; i--) {
            sb.append(xArr[i]);
        }
        return sb.toString().equals(xStr) ? true : false;
    }
}