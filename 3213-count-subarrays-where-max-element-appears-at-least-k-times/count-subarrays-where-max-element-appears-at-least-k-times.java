class Solution {
    public long countSubarrays(int[] A, int k) {
         int a = Arrays.stream(A).max().getAsInt();
        int n = A.length, cur = 0, i = 0;
        long res = 0;
        for (int j = 0; j < n; ++j) {
            cur += A[j] == a ? 1 : 0;
            while (cur >= k)
                cur -= A[i++] == a ? 1 : 0;
            res += i;
        }
        return res;
    }
}