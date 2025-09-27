class Solution {
    public int solution(int[] box, int n) {
        int widthBox = box[0] / n;
        int lengthBox = box[1] / n;
        int heightBox = box[2] / n;
        return widthBox * lengthBox * heightBox;
    }
}