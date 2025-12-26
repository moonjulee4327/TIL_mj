class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i = 0; i < emergency.length; i++) {
            answer[i] = emergency.length;
            for(int j = 0; j < emergency.length; j++) {
                if(i != j && emergency[i] > emergency[j]) {
                    answer[i]--;
                }
            }
        }

        return answer;
    }
}