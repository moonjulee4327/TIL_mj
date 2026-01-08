class Solution {
    public String solution(String bin1, String bin2) {
        int i = bin1.length() - 1;
        int j = bin2.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += bin1.charAt(i--) - '0';
            if (j >= 0) sum += bin2.charAt(j--) - '0';

            sb.append(sum & 1);
            carry = sum >> 1;
        }

        return sb.reverse().toString();
    }
}