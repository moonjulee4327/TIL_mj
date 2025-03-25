class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int previous = numLog[0];
        
        for(int i = 1; i < numLog.length; i++) {
            if(numLog[i] == previous + 1) {
                answer += "w";
                previous += 1;
            }else if(numLog[i] == previous - 1) {
                answer += "s";
                previous -= 1;
            }else if(numLog[i] == previous + 10) {
                answer += "d";
                previous += 10;
            }else {
                answer += "a";
                previous -= 10;
            }
        }
        
        return answer;
    }
}