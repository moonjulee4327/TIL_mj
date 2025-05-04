class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        if(arr1.length == arr2.length) {
            for(int arr : arr1) {
                sum1 += arr;
            }
            for(int arr : arr2) {
                sum2 += arr;
            }
            
            if(sum1 > sum2) {
                return 1;
            }else if(sum1 < sum2) {
                return -1;
            }else{
                return 0;   
            }
        }
        
        return arr1.length > arr2.length ? 1 : -1;
    }
}