class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int num = 0;
        for(boolean finish : finished) {
            if(!finish) {
                num++;
            }
        }
        
        int idx = 0;
        String[] answer = new String[num];
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) {
                answer[idx++] = todo_list[i];
            }
        }
        
        return answer;
    }
}