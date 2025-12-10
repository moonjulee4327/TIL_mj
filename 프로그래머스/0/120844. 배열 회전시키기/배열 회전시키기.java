class Solution {
    public int[] solution(int[] numbers, String direction) {
        boolean flag = direction.equals("right") ? true : false;
        int temp;
        
        if(flag) {
            // right
            temp = numbers[numbers.length - 1];
            for(int i = numbers.length - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = temp;
        }else {
            // left
            temp = numbers[0];
            for(int i = 1; i < numbers.length; i++) {
                numbers[i - 1] = numbers[i];
            }
            numbers[numbers.length - 1] = temp; 
        }
        
        return numbers;
    }
}