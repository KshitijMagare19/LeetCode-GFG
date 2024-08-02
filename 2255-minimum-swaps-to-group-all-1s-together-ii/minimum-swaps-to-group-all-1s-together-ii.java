class Solution {
    public int minSwaps(int[] nums) {
        int Tones = 0;
        for(int i : nums) if(i == 1) Tones++;
        int Cones = 0;
        for(int i = 0; i < Tones; i++){
            if(nums[i] == 1) Cones++;           
        }
        int ans = Cones;
        for(int i = 1, j = Tones  ; i < nums.length; i++,j++){
            if(j >= nums.length) j = 0;
            if(nums[i-1] == 1) Cones--;
            if(nums[j] == 1) Cones++;
            ans = Math.max(ans,Cones);
           // System.out.println("i : "+ i + ", "+"j : "+ j + ", "+"nums[i] : "+ nums[i] + ", "+"nums[j] : "+ nums[j] +",Cones "+Cones );

           
        }
        return Tones - ans;
    }
}