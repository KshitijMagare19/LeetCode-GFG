class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        
        for (int num = low; num <= high; num++) {
            if (isSymmetric(num)) {
                count++;
            }
        }
        
        return count;
    }
    
    // Helper function to check if a number is symmetric
    private boolean isSymmetric(int num) {
        String numStr = String.valueOf(num);
        int n = numStr.length();
        
        if (n % 2 != 0) {
            return false; // Odd-length numbers are never symmetric
        }
        
        int sum1 = 0;
        int sum2 = 0;
        
        for (int i = 0; i < n / 2; i++) {
            sum1 += Character.getNumericValue(numStr.charAt(i));
            sum2 += Character.getNumericValue(numStr.charAt(n - 1 - i));
        }
        
        return sum1 == sum2;
    }
}