import java.util.*;

class Solution {
    public int solution(String before, String after) {
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        
        for(String b : before.split("")) {
            arr1.add(b);
        }
        
        for(String a : after.split("")) {
            arr2.add(a);
        }
        
        for(int i = 0; i < arr2.size(); i++) {
            for(int j = 0; j < arr1.size(); j++) {
                if(arr1.get(j).equals(arr2.get(i))) {
                    arr1.remove(j);
                    break;
                }
            }
        }
        
        return arr1.size() == 0 ? 1 : 0;
    }
}