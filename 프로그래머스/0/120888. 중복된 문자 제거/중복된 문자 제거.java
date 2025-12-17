import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = my_string.split("");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        for(String s : strArr) {
            set.add(s);
        }
        
        for(String s : set) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}