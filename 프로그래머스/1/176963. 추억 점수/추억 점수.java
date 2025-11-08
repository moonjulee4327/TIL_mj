import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        int sum;
        for(int i = 0; i < photo.length; i++) {
            String[] people = photo[i];
            sum = 0;
            for(int j = 0; j < people.length; j++) {
                if(map.containsKey(people[j])) {
                    sum += map.get(people[j]); 
                }
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}