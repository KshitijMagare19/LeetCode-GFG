class Solution {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (((nums[i] ^ nums[i-1]) & 1) == 0)  // Check if XOR's last bit is 0
                return false;  // \U0001f6ab Same parity → invalid
        }
        return true;  // ✅ Valid special array
    }
}