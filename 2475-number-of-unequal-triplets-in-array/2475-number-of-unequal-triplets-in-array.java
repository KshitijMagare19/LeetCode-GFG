class Solution {    
    public int unequalTriplets(int[] nums) {
        int n = nums.length;
        int count = 0;
        
        for(int i=0; i<n; i++){
            int first = nums[i];
            
            for(int j=i+1; j<n; j++){
                int second = nums[j];
                if(second==first){ // skip
                    continue;
                }
        
                for(int k=j+1; k<n; k++){
                    int third = nums[k];
                    
                    if(third==first || third==second){ //skip
                        continue;
                    } else{
                        count++;
                    }
                }
                
            }
        }
        
        return count;
    }
}