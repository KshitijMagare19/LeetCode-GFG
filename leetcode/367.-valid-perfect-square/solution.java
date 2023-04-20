class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1, right = 46340; // sqrt(2^31 - 1) < 46340 
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid * mid == num)
                return true;
            if (mid * mid < num)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}