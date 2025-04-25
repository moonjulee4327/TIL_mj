class Solution {
    public String[] solution(String my_string) {
        String[] stringArr = my_string.split(" ");
        
        int count = 0;
        for(int i = 0; i < stringArr.length; i++) {
            if(!stringArr[i].equals("")) {
                count++;
            }
        }
        
        String[] answer = new String[count];
        int idx = 0;
        for(int i = 0; i < stringArr.length; i++) {
            if(!stringArr[i].equals("")) {
                answer[idx++] = stringArr[i];
            }
        }
        
        return answer;
    }
}