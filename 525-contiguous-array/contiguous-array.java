class Solution {
    public int findMaxLength(int[] nums) {
        int ans = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int index = 0;
        for(int i : nums){
            //(i==0):sum++
            if(i==0){
                sum--;
            }
            else{
                sum++;
            }
            if(sum == 0){
                ans = Math.max(ans,index+1);
            }
            
            if(map.containsKey(sum)){
                ans = Math.max(ans,index - map.get(sum));
            }
            else{
                map.put(sum,index);
            }
            index++;
        }
        return ans;
    }
}