class Solution {
    public int noOfOnes(String s){
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1') ans++;
        }
        return ans;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0; i <=n; i++){
            ans[i] = noOfOnes(Integer.toBinaryString(i));
        }
        return ans;
        
    }
}