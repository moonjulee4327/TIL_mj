class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int temp1 = 0;
        int temp2 = 0;
        while(box[0] >= n) {
            temp1++;
            box[0] -= n;
        }
        System.out.println(temp1);
        temp2 = temp1;
        temp1 = 0;
        
        while(box[1] >= n) {
            temp1++;
            box[1] -= n;
        }
        System.out.println(temp1);
        temp2 *= temp1;
        temp1 = 0;
        
        while(box[2] >= n) {
            temp1++;
            box[2] -= n;
        }
        System.out.println(temp1);
        temp2 *= temp1;
        
        return temp2;
    }
}