class Solution {
    public int solution(int chicken) {
        return coupon(chicken);
    }
    
    private int coupon(int chicken) {
        int coupon = 0;
        int serviceChiken = 0;
        while(chicken >= 10) {
            coupon = chicken;
            chicken = coupon / 10;
            coupon += coupon % 10;
            serviceChiken += coupon / 10;
        }
        return serviceChiken;
    }
}