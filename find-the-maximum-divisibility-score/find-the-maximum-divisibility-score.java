class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int ans = 0;
        int max = -1;
        Arrays.sort(divisors);
        for(int i : divisors){
            int temp = 0;
            for(int j : nums){
                if(j%i == 0){
                    temp++;
                    if(max<temp){
                        max = temp;
                        ans = i;
                    }
                }
            }
        }
        if(ans == 0){
            return divisors[0];
        }
        return ans;
    }
}