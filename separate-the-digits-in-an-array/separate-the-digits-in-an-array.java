class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : nums){
            String s = String.valueOf(i);
            if(s.length() == 1){
                arr.add(i);
            }
            else{
                for(int j = 0; j < s.length(); j++){
                    arr.add(s.charAt(j) - '0');
                }
            }
        }
        int[] ans = new int[arr.size()];
        int index = 0;
        for(int i : arr){
            ans[index++] = i;
        }
        return ans;
        
    }
}