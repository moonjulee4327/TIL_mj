class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        char[] sArr = s.toCharArray();
        for(int i = 1; i < sArr.length; i++) {
            for(int j = i - 1; j >= 0; j--) {
                if(sArr[i] == sArr[j]) {
                    answer[i] = i - j;
                    break;
                }
            }
            if(answer[i] == 0) {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}