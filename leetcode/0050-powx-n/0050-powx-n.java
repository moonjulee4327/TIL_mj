class Solution {
    public double myPow(double x, int n) {
        double result = x;
        long temp = n > 0 ? n : -(long)n;
        System.out.println(temp);
        result = Math.pow(x, temp);
        System.out.println(result);
        if(n < 0) {
            result = (double) 1 / result;
        }
        return result;
    }
}