    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int n) {
        
        // Your code here
        int ans = 0, flag = 0;
        if (n == 0) return 0;
        int temp = 2;
        String s = Integer.toBinaryString(n);
        for(int i = 1; i < s.length(); i++){
            
            if(s.charAt(i) == s.charAt(i-1)&& s.charAt(i) == '1' && flag == 0){
                ans = 2;
                temp = 2;
                flag = 1;
            }
            else if(s.charAt(i) == s.charAt(i-1) && s.charAt(i) == '1' && flag == 1){
                temp++;
                ans = Math.max(ans, temp);
            }
            else{
                temp = 1;
            }
        }
        if(ans == 0) return 1;
        return ans;
        
    }
}