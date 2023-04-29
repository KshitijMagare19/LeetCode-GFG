class Solution {
    public int divisorSubstrings(int num, int k) {
        int ans = 0;
        String s = String.valueOf(num);
        for(int i = 0 ; i < s.length() - k+1 ; i++){
            int n = Integer.valueOf(s.substring(i,i+k));
            //System.out.println(num % n == 0 + " "+ i);
            if(n == 0) continue;
            if(num % n == 0) ans++;
        }
        return ans;
    }
}