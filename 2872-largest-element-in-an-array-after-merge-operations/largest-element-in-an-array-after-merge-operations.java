class Solution {
    public long maxArrayValue(int[] nums) {
        if(nums.length==1)
        {
            return (long)nums[0];
        }
        if(nums.length==2)
        {
            return nums[0] <= nums[1] ? (long)(nums[0]+nums[1]) : (long)(Math.max(nums[0],nums[1]));
        }
        int size=nums.length;
        long ans=0,dat=(long)nums[size-1];
        for(int i=size-2;i>=0;i--)
        {
            long val=(long)nums[i];
            if(val<=dat)
            {
                dat=dat+val;
                if(dat>ans)
                {
                    ans=dat;
                }
            }
            else
            {
                if(dat>ans)
                {
                    ans=dat;
                }
                dat=val;
            }
        }
        return dat;
    }
}