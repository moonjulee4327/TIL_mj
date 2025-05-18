class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int valExtNum = 0;
        switch(ext) {
            case "code" : 
                valExtNum = 0;
                break;
            case "date" : 
                valExtNum = 1;
                break;
            case "maximum" : 
                valExtNum = 2;
                break;
            case "remain" : 
                valExtNum = 3;
                break;
        }
        
        int cnt = 0;
        for(int i = 0; i < data.length; i++) {
            if(val_ext > data[i][valExtNum]) {
                cnt++;
            }
        }
        
        int idx = 0;
        int[][] answer = new int[cnt][4];
        for(int i = 0; i < data.length; i++) {
            if(val_ext > data[i][valExtNum]) {
                answer[idx++] = data[i];
            }
        }
        
        int sortNum = 0;
        switch(sort_by) {
            case "code" : 
                sortNum = 0;
                break;
            case "date" : 
                sortNum = 1;
                break;
            case "maximum" : 
                sortNum = 2;
                break;
            case "remain" : 
                sortNum = 3;
                break;
        }
        
        for(int i = 0; i < cnt - 1; i++) {
            for(int j = 0; j < cnt - i - 1; j++) {
                if(answer[j][sortNum] > answer[j + 1][sortNum]) {
                    int temp[] = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
            }
        }
        
        return answer;
    }
}