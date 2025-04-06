class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for(int[] query : queries) {
            String front = answer.substring(0, query[0]);
            String center = "";
            for(int i = query[1]; query[0] <= i; i--) {
                center += answer.charAt(i);
            }
            String back = answer.substring(query[1] + 1, answer.length());
            
            answer = front + center + back;
        }
        
        return answer;
    }
}