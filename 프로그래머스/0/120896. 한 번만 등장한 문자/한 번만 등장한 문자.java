import java.util.*;

class Solution {
    public String solution(String s) {
        int[] cnt = new int[26];

        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (cnt[i] == 1) sb.append((char)('a' + i));
        }

        return sb.toString();
    }
}
