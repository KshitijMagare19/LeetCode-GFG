class Solution {
    public int minChanges(int n, int k) {
        String s1 = Integer.toBinaryString(n), s2 = Integer.toBinaryString(k);
        if(n == k) return 0;
        if(s2.length() > s1.length()) return -1;
        while(s1.length() != s2.length()){
            s2 ='0'+s2;
        }
        int ans = 0;
        for(int i = 0; i < s2.length() ; i++){
            char c1 = s1.charAt(i), c2 = s2.charAt(i);
            if(c1 == '1' && c2 == '0') ans++;
            else if(c1 == '0' && c2 == '1') return -1;
        }
        return ans;
    }
}