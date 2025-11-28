class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] temp = new String[n];
        
        for(int i = 0; i < n; i++) {
            temp[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            while(n > temp[i].length()) {
                temp[i] = "0" + temp[i];
            }
        }
        
        char[] cArr = new char[n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(temp[i].charAt(j) == '1') {
                    cArr[j] = '#';
                }else {
                    cArr[j] = ' ';
                }
            }
            answer[i] = String.valueOf(cArr);
        }
        
        return answer;
    }
}