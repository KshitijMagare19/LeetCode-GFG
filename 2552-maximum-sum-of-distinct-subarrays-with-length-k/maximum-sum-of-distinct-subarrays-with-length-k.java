class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
               long maxSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 0 , i = 0;
        long currSum = 0;
        
        while( j < nums.length){
            map.put(nums[j] , map.getOrDefault(nums[j], 0) + 1); //putting element to map
            currSum += nums[j];         //updating currsum
            if(j - i + 1 == k){         //Checking in every 3 pairs
                if(map.size() == k){
                    maxSum = Math.max(currSum , maxSum);        //updating maxsum
                }
                currSum -= nums[i];         //deducting first element of the triplet as we move forward
                map.put(nums[i], map.get(nums[i])-1);                  
				if (map.get(nums[i]) == 0) map.remove(nums[i]);  //updating map
				i++;
            }
            j++;
        }
        
        
        return maxSum;
    }
}