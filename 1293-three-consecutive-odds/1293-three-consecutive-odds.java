class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int len = arr.length;
        if(len <= 2) return false;
        int i = 0, j = 1, k = 2;
        for(;k<len;k++,i++,j++){
            if(arr[i] % 2 == 1 &&
               arr[j] % 2 == 1 &&
               arr[k] % 2 == 1) return true;
        }
        return false;
    }
}