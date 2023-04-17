class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[2];
        int max1  = 0, mac =0;
        int r = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    max1++;
                    if(mac < max1){
                        r = i;
                    }
                    mac = Math.max(mac,max1);
                }
            }
            System.out.println(mac + " "+ max1);
            max1 = 0;
        }
        ans[0] = r;
        ans[1] = mac;
        return ans;

    }
}