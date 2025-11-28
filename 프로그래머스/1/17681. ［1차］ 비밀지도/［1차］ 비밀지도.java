class Solution {
    
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] temp1 = new String[n];
        String[] temp2 = new String[n];
        
        for(int i = 0; i < n; i++) {
            temp1[i] = Integer.toBinaryString(arr1[i]);
            temp2[i] = Integer.toBinaryString(arr2[i]);
            
            while(n > temp1[i].length()) {
                temp1[i] = "0" + temp1[i];
            }
            
            while(n > temp2[i].length()) {
                temp2[i] = "0" + temp2[i];
            }
        }
        
        char[] cArr = new char[n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(temp1[i].charAt(j) == '1' || temp2[i].charAt(j) == '1') {
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