class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] str = binomial.split(" ");
        
        switch(str[1]) {
            case "+" :
                answer = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
                break;
            case "-" :
                answer = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
                break;
            case "*" :
                answer = Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
                break;
        }
        
        return answer;
    }
}