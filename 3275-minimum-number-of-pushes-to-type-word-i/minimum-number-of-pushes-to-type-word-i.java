class Solution {
    public int minimumPushes(String word) {
         int ans = 0;
        int n = word.length();
        int row = 1;
         int quotient = n / 8;
        int remainder = n % 8;

        // Iterate over complete cycles (quotient)
        while (quotient > 0) {
            // Add the product of 8 (number of keys in a cycle) and the current row to the result
            ans += 8 * row;

            // Decrement the quotient and increment the row for the next cycle
            quotient--;
            row++;
        }

        // Add the product of the remainder and the final row to account for remaining letters
        ans += remainder * row;

        // Return the final result, representing the minimum number of key presses
        return ans;
    }
}