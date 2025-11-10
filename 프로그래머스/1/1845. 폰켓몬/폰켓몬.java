import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums) {
            set.add(num);
        }

        int length = nums.length / 2;
        int size = set.size();
        
        return length > size ? size :length;
    }
}