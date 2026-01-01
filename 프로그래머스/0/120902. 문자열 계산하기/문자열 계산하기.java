class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split(" ");
        
        for(int i = 0; i < strArr.length; i += 2) {
            int strNum = Integer.parseInt(strArr[i]);
            
            if(i == 0) {
                answer = strNum;
            }else if(strArr[i - 1].equals("+")) {
                answer += strNum;
            }else {
                answer -= strNum;
            }
        }
        
        return answer;
    }
}