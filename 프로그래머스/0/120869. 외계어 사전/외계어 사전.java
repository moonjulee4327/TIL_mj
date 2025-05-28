import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        int[][] result = new int[dic.length][spell.length];
        for(int i = 0; i < spell.length; i++) {
            for(int j = 0; j < dic.length; j++) {
                char[] dicArr = dic[j].toCharArray();
                for(int k = 0; k < dicArr.length; k++) {
                    if(String.valueOf(dicArr[k]).equals(spell[i])) {
                        result[j][i]++;
                    }
                }
            }
        }
        
        for(int i = 0; i < result.length; i++) {
            boolean flag = true;
            for(int j = 0; j < result[i].length; j++) {
                if(result[i][j] != 1) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                return 1;
            }
        }
        
        return answer;
    }
}