class Solution {    
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
		int[] res = new int[3];
        int[] psum = new int[nums.length+1];
        for(int i=1; i<psum.length; i++){
            psum[i] += psum[i-1]+nums[i-1];
        }
        
        int s1 = 0, s12 = 0, s123 = 0;
        int i11 = -1, i21 = -1, i22 = -1;
        for(int i=0; i<=nums.length - 3*k; i++){         //start of 1st arr
            
            if(s1<psum[i+k] - psum[i]){
                s1 = psum[i+k] - psum[i];
                i11 = i;
            }

            if(s1+ psum[i+2*k] - psum[i+k] > s12){
                s12 = s1 + psum[i+2*k] - psum[i+k];
                i21 = i11;
                i22 = i+k;
            }

            if(s12 + psum[i+3*k] - psum[i+2*k] > s123){
                s123 = s12 + psum[i+3*k] - psum[i+2*k];
                res[0] = i21;
                res[1] = i22;
                res[2] = i+2*k;
            }
        }
        return res;
    }
}