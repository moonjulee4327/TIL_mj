class Solution {
    public int solution(String n_str) {
        int answer = 0;
        try {
            answer = Integer.parseInt(n_str);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        return answer;
    }
}