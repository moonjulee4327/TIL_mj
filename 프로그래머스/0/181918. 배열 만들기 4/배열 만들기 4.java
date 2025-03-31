import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        
        for(int i = 0; i < arr.length; ) {
            if(stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
                // System.out.println(stk);
            }else if(stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
                i++;
                // System.out.println(stk);
            }else {
                stk.remove(stk.size() - 1);
                // System.out.println(stk);
            }
        }
        
        System.out.println(stk);
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}