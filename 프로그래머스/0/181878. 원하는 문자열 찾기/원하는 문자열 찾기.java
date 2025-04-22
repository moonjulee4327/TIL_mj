class Solution {
    public int solution(String myString, String pat) {
        String UpperMyString = myString.toUpperCase();
        String UpperPat = pat.toUpperCase();

        return UpperMyString.contains(UpperPat) ? 1 : 0;
    }
}