class Solution {
    public int numOfSubarrays(int[] arr) {
        long ans = 0, odd = 0, even = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                even ++;
            } else {
                long temp = even;
                even = odd;
                odd = temp;
                odd++;
            }
            ans += odd;
        }
        return (int)(ans % (Math.pow(10, 9) + 7));
    }
}