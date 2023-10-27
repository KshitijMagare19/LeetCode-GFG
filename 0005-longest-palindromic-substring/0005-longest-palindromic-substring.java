class Solution {
    int start = 0, end  = 0;
    public String longestPalindrome(String s) {
    
		if(s.length()<2) return s;
        
		char[] c = s.toCharArray();
        int m = c.length;
        int l = 0, r = 0;
        
		for(int i = 0; i < m;i++){
            r = i;
            l = i;
        
			recursion(c, l, r, m);
            
            r = i + 1;
            l = i;
            
			recursion(c, l, r, m);
        }
        
        return s.substring(start, end + 1);
    }
    
    public void recursion(char[] s, int l, int r,  int m){
        if(l < 0 || r >= m || s[l] != s[r]) return;
        
        if( (r - l) > (end - start)){
            end = r;
            start = l;
        }

        recursion(s, --l, ++r, m);
    }
}