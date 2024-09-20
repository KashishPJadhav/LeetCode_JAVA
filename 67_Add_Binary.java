class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        
        // Make both strings of equal length by padding the shorter one with '0's
        int aLen = a.length();
        int bLen = b.length();
        int maxLen = Math.max(aLen, bLen);
        
        // Iterate over the strings from the right (LSB) to the left (MSB)
        for (int i = 0; i < maxLen; i++) {
            // Get the current digit from a and b, or 0 if the string is too short
            int aBit = i < aLen ? a.charAt(aLen - 1 - i) - '0' : 0;
            int bBit = i < bLen ? b.charAt(bLen - 1 - i) - '0' : 0;
            
            // Calculate the sum of the bits plus carry
            int sum = aBit + bBit + carry;
            
            // Append the result bit to the result (sum % 2) and calculate the new carry
            result.append(sum % 2);
            carry = sum / 2;
        }
        
        // If there's still a carry, append it to the result
        if (carry > 0) {
            result.append(carry);
        }
        
        // The result is built in reverse order, so reverse it
        return result.reverse().toString();
        
    }
}
