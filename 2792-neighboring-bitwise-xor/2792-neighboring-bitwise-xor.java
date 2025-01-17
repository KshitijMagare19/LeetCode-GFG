class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        return Arrays.stream(derived).sum() % 2 == 0;
    }
}