class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        boolean flag;
        String[] strArr = my_string.split("");
        
        for(int i = 0; i < strArr.length; i++) {
            flag = true;
            for(int j = 0; j < i; j++) {
                if(strArr[i].equals(strArr[j])) {
                    flag = false;
                    break;
                }
            }
            
            if(flag) {
                sb.append(strArr[i]);
            }
        }
        
        return sb.toString();
    }
}