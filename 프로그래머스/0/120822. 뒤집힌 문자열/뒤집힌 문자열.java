class Solution {
    public String solution(String my_string) {
        char[] my_string_char_arr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = my_string_char_arr.length - 1; i >= 0; i--) {
            sb.append(my_string_char_arr[i]);
        }
        return sb.toString();
    }
}