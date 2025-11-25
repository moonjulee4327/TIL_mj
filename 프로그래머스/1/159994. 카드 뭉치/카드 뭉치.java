class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        int idx1 = 0;
        int idx2 = 0;
        StringBuilder sb = new StringBuilder();
        String goalStr = String.join("", goal);
        
        for(String g : goal) {
            if(g.equals(cards1[idx1])) {
                if(idx1 < cards1.length - 1) {
                    idx1++;
                }
                sb.append(g);
            }else if(g.equals(cards2[idx2])) {
                if(idx2 < cards2.length - 1) {
                    idx2++;
                }
                sb.append(g);
            }else {
                break;
            }
            
            if(sb.toString().equals(goalStr)) {
                answer = "Yes";
            }
        }
        
        if(idx1 == cards1.length - 1 && idx2 == cards2.length - 1) {
            answer = "Yes";
        }
        
        return answer;
    }
}