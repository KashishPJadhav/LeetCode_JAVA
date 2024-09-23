class Solution {
public:
    int mySqrt(int x) {
        if (x == 0 || x == 1) return x;  // Handle base cases
        
        long low = 0, high = x, ans = 0;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            // Check if mid*mid is exactly x
            if (mid * mid == x)
                return mid;
            
            // If mid*mid is less than x, store mid as a potential answer and search in the right half
            if (mid * mid < x) {
                ans = mid;
                low = mid + 1;
            } else {
                // Search in the left half
                high = mid - 1;
            }
        }
        
        return ans;
    }
};
