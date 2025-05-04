class Solution {
    public int solution(String[] strArr) {
        int top = 0;
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].length() > top) {
                top = strArr[i].length();
            }
        }

        int[] result = new int[top];
        for(int i = 0; i < strArr.length; i++) {
            result[strArr[i].length() - 1]++;
        }
        
        top = 0;
        for(int i = 0; i < result.length; i++) {
            if(result[i] > top) {
                top = result[i];
            }
        }

        return top;
    }
}