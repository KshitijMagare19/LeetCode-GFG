class Solution {
    public boolean gcd(int x, int y){
        int n = Math.min(x,y);
        for(int i = 2; i <=n; i++){
            if(x % i == 0 && y % i == 0) return false;
        }
        
        return true;
    }
    public int countBeautifulPairs(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                String n1 = String.valueOf(nums[i]);
                int x = n1.charAt(0) - '0';
                int y = nums[j] % 10;
                if(gcd(x,y)){
                    ans++;
                } 
            }
        }
        return ans;
    }
}