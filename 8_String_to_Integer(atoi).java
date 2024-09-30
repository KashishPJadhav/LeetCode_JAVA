public class Solution {
    public int myAtoi(String s) {
        int result = 0;
        int sign = 1;
        int i = 0;

        // Ignore leading whitespace
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Determine sign
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Read integer
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }

        return sign * result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String param_1 = "42"; // example input
        int ret = solution.myAtoi(param_1);
        System.out.println("Output: " + ret);
    }
}
