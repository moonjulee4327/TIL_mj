class Solution {
    public int solution(int[] numList) {
        return multiply(numList) > pow(sum(numList), 2) ? 0 : 1;
    }
    
    private int multiply(int[] numList) {
        int num = 1;
        for(int i = 0; i < numList.length; i++) {
            num *= numList[i];
        }
        return num;
    }
    
    private int sum(int[] numList) {
        int num = 0;
        for(int i = 0; i < numList.length; i++) {
            num += numList[i];
        }
        return num;
    }
    
    private int pow(int base, int exponent) {
        if(exponent == 0) return 1; 
        return base * pow(base, exponent - 1);
    }
}