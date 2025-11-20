import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] count = new int[3];
        int[] h1 = new int[] {1, 2, 3, 4, 5};
        int[] h2 = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
        int[] h3 = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i = 0; i < answers.length; i++) {
            if(x > h1.length - 1) {
                x = 0;
            }
            if(y > h2.length - 1) {
                y = 0;
            }
            if(z > h3.length - 1) {
                z = 0;
            }
            
            if(answers[i] == h1[x++]) {
                count[0]++;
            } 
            if(answers[i] == h2[y++]) {
                count[1]++;
            } 
            if(answers[i] == h3[z++]) {
                count[2]++;
            }
        }
        
        int max = 0;
        for(int c : count) {
            if(c > max) {
                max = c;
            }
        }
        
        int idx = 0;
        for(int c : count) {
            if(max == c) {
                idx++;
            }
        }
        
        int[] answer = new int[idx];
        int idx2 = 0;
        for(int i = 0; i < count.length; i++) {
            if(max == count[i]) {
                answer[idx2++] = i + 1;
            }
        }
        
        return answer;
    }
}
