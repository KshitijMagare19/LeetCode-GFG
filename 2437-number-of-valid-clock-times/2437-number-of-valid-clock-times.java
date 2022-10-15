class Solution {
    public int countTime(String time) {
        int ans = 1;
        if(time.charAt(4) == '?') ans = ans * 10;
        if(time.charAt(3) == '?') ans = ans * 6;
        
        if(time.charAt(0) == '?' && time.charAt(1) == '?') ans = ans * 24;
        else{
            if(time.charAt(1) == '?'){ 
                if(time.charAt(0) == '2' ) ans = ans * 4;
                else ans = ans * 10;
            }
            if(time.charAt(0) == '?'){
                if(time.charAt(1) < '4') ans = ans * 3;
                else ans = ans * 2;
            }
        }
        return ans;
    }
}