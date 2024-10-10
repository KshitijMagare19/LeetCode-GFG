
class Solution {
    public int maxWidthRamp(int[] A) {
        int n = A.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.empty() || A[i] < A[st.peek()]) {
                st.push(i);
            }
        }
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && A[i] >= A[st.peek()]) {
                ans = Math.max(i - st.pop(), ans);
            }
        }
        return ans;
    }
}