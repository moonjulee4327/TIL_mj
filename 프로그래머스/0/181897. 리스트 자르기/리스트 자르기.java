import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        switch(n) {
            case 1 :
                answer = new int[slicer[1] + 1];
                for(int i = 0; i <= slicer[1]; i++) {
                      answer[i] = num_list[i];
                }
                break;
            case 2 :
                answer = new int[num_list.length - slicer[0]];
                for(int i = slicer[0]; i < num_list.length; i++) {
                      answer[i - slicer[0]] = num_list[i];
                }
                break;
            case 3 :
                answer = new int[slicer[1] - slicer[0] + 1];
                for(int i = slicer[0]; i <= slicer[1]; i++) {
                      answer[i - slicer[0]] = num_list[i];
                }
                break;
            case 4 :
                List<Integer> list = new ArrayList<Integer>();
                for(int i = slicer[0]; i <= slicer[1]; i = i + slicer[2]) {
                      list.add(num_list[i]);
                }
                answer = new int[list.size()];
                for(int i = 0; i < list.size(); i++) {
                    answer[i] = list.get(i);
                }
                break;
        }
        return answer;
    }
}