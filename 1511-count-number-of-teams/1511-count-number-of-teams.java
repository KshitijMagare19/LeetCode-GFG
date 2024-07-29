class Solution {
    public int numTeams(int[] arr) {
        int ans = 0;
        int n = arr.length;
        // for(int i = 0; i < n - 2;i++){
        //     for(int j = i + 1; j < n - 1; j++){
        //         for(int k = j + 1; k < n; k++){
        //             if((arr[i] < arr[j])&&(arr[j] < arr[k])) ans++;
        //         }
        //     }
        // }
        // for(int i = 0; i < n - 2;i++){
        //     for(int j = i + 1; j < n - 1; j++){
        //         for(int k = j + 1; k < n; k++){
        //             if((arr[i] > arr[j])&& (arr[j] > arr[k])) ans++;
        //         }
        //     }
        // }
       

        for(int j = 1; j < n-1; j++){ 
            int leftSmaller  = 0;
        int leftLarger   = 0;
        int rightSmaller = 0;
        int rightLarger  = 0;
            for(int i = 0; i < j; i++){
                if(arr[i] < arr[j]){
                    leftSmaller++;
                }
                else{
                    leftLarger++;
                }

            }
            for(int k = j+1; k < n; k++){
                if(arr[k] < arr[j]){
                    rightSmaller++;
                }
                else{
                    rightLarger++;
                }
            }
        ans += (leftSmaller * rightLarger) + (rightSmaller * leftLarger) ;
        }
        



        return ans;
    }
}