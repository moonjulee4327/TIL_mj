import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("a", " ");
        myStr = myStr.replaceAll("b", " ");
        myStr = myStr.replaceAll("c", " ");
        
        String[] result = myStr.split(" +");
        List<String> list = new ArrayList<String>();
        
        for(String s : result) {
            if(!s.equals("")) {
                list.add(s);                   
            }
        }
        
        String[] strArr = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            strArr[i] = list.get(i);
        }
        
        return strArr.length == 0 ? new String[]{"EMPTY"} : strArr;
    }
}