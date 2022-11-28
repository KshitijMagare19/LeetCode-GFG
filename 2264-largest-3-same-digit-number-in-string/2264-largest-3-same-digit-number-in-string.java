class Solution {
    public String largestGoodInteger(String nums) {
        String ans = "";
        for(int i = 0; i < nums.length() - 2; i++){
            if(nums.charAt(i)==nums.charAt(i+1) && nums.charAt(i+1)==nums.charAt(i+2)){
                if(ans.length() != 0 && ans.charAt(0) > nums.charAt(i)){
                    continue;
                }
                else if(ans.length() != 0 && ans.charAt(0) < nums.charAt(i)){
                    ans = Character.toString(nums.charAt(i))+Character.toString(nums.charAt(i))+Character.toString(nums.charAt(i));
                }
                else{
                    ans = Character.toString(nums.charAt(i))+Character.toString(nums.charAt(i))+Character.toString(nums.charAt(i));
                }
                i+=2;
            }
            
        }
        return ans;
    }; 
}