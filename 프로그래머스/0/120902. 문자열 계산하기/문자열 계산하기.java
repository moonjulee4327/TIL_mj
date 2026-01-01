class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split(" ");
        
        for(int i = 0; i < strArr.length; i++) {
            if(i != 0 && strArr[i - 1].equals("+")) {
                answer += Integer.parseInt(strArr[i]);
            }else if(i != 0 && strArr[i - 1].equals("-")) {
                answer -= Integer.parseInt(strArr[i]);
            }else if(!strArr[i].equals("+") && !strArr[i].equals("-")) {
                answer = Integer.parseInt(strArr[i]);
            }
        }
        
        return answer;
    }
}