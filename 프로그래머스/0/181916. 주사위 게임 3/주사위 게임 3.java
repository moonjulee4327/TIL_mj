import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] abcd = {a, b, c, d};
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 1; i <= 6; i++) {
            map.put(i, 0);
        }
        
        for(int i = 0; i < abcd.length; i++) {
            map.put(abcd[i], map.get(abcd[i]) + 1);
        }
        
        Map<Integer, Integer> result = new HashMap<>();
        
        for(int i = 1; i <= map.size(); i++) {
            if(map.get(i) > 0) {
                result.put(i, map.get(i));
            }
        }
        
        Set<Integer> set = result.keySet();
        int three = 1;
        int two1 = 0;
        int two2 = 0;
        
        for(Integer i : set) {
            if(result.size() == 1) {
                return 1111 * i;
            }else if(result.size() == 4) {
                return i;
            }else if(result.size() == 3) {
                if(result.get(i) == 1) {
                     three *= i;           
                }
            }
        }
        
        if(result.size() == 3) {
            answer = three;
        }

        List<Integer> list = new ArrayList<>();
        if(result.size() == 2) {
            for(Integer i : set) {
                list.add(i);
            }
            if(result.get(list.get(0)) == 1) {
                return (10 * list.get(1) + list.get(0)) * (10 * list.get(1) + list.get(0));
            }else if(result.get(list.get(0)) == 3) {
                return (10 * list.get(0) + list.get(1)) * (10 * list.get(0) + list.get(1));
            }else {
                return (list.get(0) + list.get(1)) * Math.abs(list.get(0) - list.get(1));
            }
        }
        
        return answer;
    }
}