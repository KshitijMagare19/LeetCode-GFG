class Solution {
    public String nearestPalindromic(String n) {
        long N = Long.parseLong(n), S = previous(String.valueOf(N-1).toCharArray()), L = next(String.valueOf(N+1).toCharArray());
        return String.valueOf(L - N < N - S ? L : S);
    }
    private long previous(char[] s) {
        for(int i = 0, n = s.length; i < (n >> 1); i++) {
            while(s[i] != s[n - 1 - i]) {
                decrement(s, n - 1 - i);
                if(s[0] == '0') return Long.parseLong(new String(s));
            }
        }
        return Long.parseLong(new String(s));
    }
    private void decrement(char[] s, int i) {
        while(s[i] == '0') s[i--] = '9';
        s[i]--;
    }
    private long next(char[] s) {
        for(int i = 0, n = s.length; i < (n >> 1); i++) {
            while(s[i] != s[n - 1 - i]) {
                increment(s, n - 1 - i);
            }
        }
        return Long.parseLong(new String(s));
    }
    private void increment(char[] s, int i) {
        while(s[i] == '9') s[i--] = '0';
        s[i]++;
    }
}