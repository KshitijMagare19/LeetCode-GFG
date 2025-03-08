class Solution {
    public int minimumRecolors(String b, int k) {
        int ms = 0;
        int ans = 0;
        int t = 1;
        for(int i = 1; i < b.length(); i++){
            if(b.charAt(i) == 'B' && b.charAt(i-1) == 'B'){
                t++;
                ms = Math.max(ms, t);
            } 
            else t = 1;
        }
        if(ms >= k) return 0;
        
        for(int i = 0; i <= ((b.length())- k); i++){
            int c = 0;
            for(int j = i; j < (k+i); j++){
                if(b.charAt(j) == 'B'){
                    c++;
                }
            }
            ans = Math.max(ans,c);
        }
        
        return k-ans;
    }
}