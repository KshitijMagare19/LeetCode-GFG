class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int c = 0;
        for(int i : nums){
            if(i%2== 0 && i%3 == 0){
                c++;
                sum+=i;
            } 
        }
        if(c == 0) return 0;
        else return sum/c;
    }
}