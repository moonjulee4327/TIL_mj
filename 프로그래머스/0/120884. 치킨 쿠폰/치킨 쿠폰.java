class Solution {
    public int solution(int chicken) {
        return coupon(chicken);
    }
    
    private int coupon(int chicken) {
        int coupon = chicken;
        int serviceChiken = 0;
        while(coupon >= 10) {
            serviceChiken += coupon / 10;
            coupon = (coupon / 10) + coupon % 10;
        }
        return serviceChiken;
    }
}