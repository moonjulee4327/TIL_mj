class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        String[] codeArr = code.split("");
        
        for(int idx = 0; idx < codeArr.length; idx++) {
            if(mode) {
                if(codeArr[idx].equals("1")) {
                    mode = false;
                }else {
                    if(idx % 2 != 0) {
                        answer += codeArr[idx];
                    }else {
                        answer += "";
                    }
                }
            }else {
                if(codeArr[idx].equals("1")) {
                    mode = true;
                }else {
                    if(idx % 2 == 0) {
                        answer += codeArr[idx];
                    }else {
                        answer += "";
                    }
                }
            }
        }
        
        return answer.equals("") ? "EMPTY" : answer;
    }
}