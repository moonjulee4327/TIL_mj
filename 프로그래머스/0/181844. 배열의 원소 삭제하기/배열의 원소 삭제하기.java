class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        int idx = arr.length;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    arr[i] = 0;
                    idx--;
                }
            }
        }
        
        int n = 0;
        int[] answer = new int[idx];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                answer[n++] = arr[i];
            }
        }
        
        return answer;
    }
}