class Solution {
public:
    int arraySign(vector<int>& nums) {
        int negativeValue = 0; 
        for(int i = 0; i < nums.size() ; i++){
            if(nums[i] < 0){
                negativeValue++;
            }
            else if(nums[i] == 0){
                return 0;
            }
        } 
        if(negativeValue%2 == 0) return 1;
        else return -1; 
    }
};