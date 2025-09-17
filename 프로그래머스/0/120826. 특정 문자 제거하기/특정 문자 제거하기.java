class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = my_string.split("");
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].equals(letter)) {
                sb.append(strArr[i]);
            }
        }
        return sb.toString();
    }
}