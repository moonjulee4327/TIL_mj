class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int x = i; x <= j; x++) {
            for(char c : String.valueOf(x).toCharArray()) {
                if(Integer.parseInt(String.valueOf(c)) == k) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}