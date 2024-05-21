class Solution {

    void solve(List<List<Integer>>ans,List<Integer>tempList,int[] nums,int startingIndex){
        ans.add(new ArrayList<>(tempList));//adding templist to ans
        for(int i = startingIndex; i < nums.length; i++ ){
            tempList.add(nums[i]);
            solve(ans,tempList,nums,i+1);
            tempList.remove(tempList.size() - 1);//removing list that we just added by giving last index
        }
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>  ans = new ArrayList<>();
        
        solve(ans,new ArrayList<>(),nums, 0);
        return ans;
    }
}