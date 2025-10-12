import java.util.*;

class Solution {
    public long solution(long n) {
        char[] c = String.valueOf(n).toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder(String.valueOf(c));
        sb.reverse();
        return Long.valueOf(String.valueOf(sb.toString()));
    }
}