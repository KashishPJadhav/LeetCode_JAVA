class Solution {
    public int divide(int dividend, int divisor) {
        // Special case: handle overflow when dividend is -2147483648 and divisor is -1
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Perform division normally
        int a = dividend / divisor;

        return a;
    }
}
