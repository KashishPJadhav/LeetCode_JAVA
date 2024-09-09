class Solution {
    public int romanToInt(String sa) {
        char[] s = sa.toCharArray();
        int sum = 0;
        int l = 0;
        
        while (l < sa.length()) {
            if (s[l] == 'I') {
                // Check if 'I' is followed by 'V' or 'X'
                if (l + 1 < sa.length() && (s[l + 1] == 'V' || s[l + 1] == 'X')) {
                    sum -= 1;
                } else {
                    sum += 1;
                }
                l++;
            } else if (s[l] == 'V') {
                sum += 5;
                l++;
            } else if (s[l] == 'X') {
                // Check if 'X' is followed by 'L' or 'C'
                if (l + 1 < sa.length() && (s[l + 1] == 'L' || s[l + 1] == 'C')) {
                    sum -= 10;
                } else {
                    sum += 10;
                }
                l++;
            } else if (s[l] == 'L') {
                sum += 50;
                l++;
            } else if (s[l] == 'C') {
                // Check if 'C' is followed by 'D' or 'M'
                if (l + 1 < sa.length() && (s[l + 1] == 'D' || s[l + 1] == 'M')) {
                    sum -= 100;
                } else {
                    sum += 100;
                }
                l++;
            } else if (s[l] == 'D') {
                sum += 500;
                l++;
            } else if (s[l] == 'M') {
                sum += 1000;
                l++;
            } else {
                return 0;  // Invalid character
            }
        }
        
        return sum;
    }
}
