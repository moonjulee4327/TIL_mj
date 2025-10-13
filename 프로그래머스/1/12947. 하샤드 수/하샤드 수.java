class Solution {
    public boolean solution(int x) {
        String[] strArr = String.valueOf(x).split("");
        int sum = 0;
        for(String str : strArr) {
            sum += Integer.parseInt(str);
        }
        return x % sum == 0;
    }
}