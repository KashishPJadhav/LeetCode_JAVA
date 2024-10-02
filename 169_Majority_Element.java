public class Solution {  // Change the class name to Solution
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;  // Set the candidate to the current number
            }
            count += (num == candidate) ? 1 : -1;  // Increment or decrement count
        }

        return candidate;  // Return the majority element
    }

}
