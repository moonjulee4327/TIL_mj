class Solution {
    public int solution(int n, String control) {
        char[] controlArr = control.toCharArray();
        
        for(char c : controlArr){
            switch(c){
            case 'w' :
                n++;
                break;
            case 's':
                n--;
                break;
            case 'd' :
                n += 10;
                break;
            case 'a' :
                n -= 10;
                break;
            default:
                break;
            }
        }
        
        return n;
    }
}