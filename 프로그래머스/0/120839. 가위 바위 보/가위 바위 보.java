class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        char[] rspArr = rsp.toCharArray();
        for(char r : rspArr) {
            if(r == '0') {
                sb.append("5");
            }else if(r == '2') {
                sb.append("0");
            }else {
                sb.append("2");
            }
        }
        return sb.toString();
    }
}