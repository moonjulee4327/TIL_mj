class Solution {
    public int solution(String n_str) {
        int answer = 0;
        try {
            answer = Integer.parseInt(n_str);
        }catch (NumberFormatException e){// int 범위 예외 처리
            e.printStackTrace();
        }
        return answer;
    }
}