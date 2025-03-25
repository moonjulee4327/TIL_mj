class Solution {
    public int[] solution(int[] numList) {
        int length = numList.length;
        int[] answer = new int[length + 1];
        int endNum = 0;
        
        if(numList[length - 1] > numList[length - 2]) {
            endNum = numList[length - 1] - numList[length - 2];
        }else {
            endNum = numList[length - 1] * 2;
        }
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = length - 1 >= i ? numList[i] : endNum;
        }
        
        return answer;
    }
}