class Solution {
    public int numTeams(int[] arr) {
        int ans = 0;
        int n = arr.length;
        for(int i = 0; i < n - 2;i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    if((arr[i] < arr[j])&&(arr[j] < arr[k])) ans++;
                }
            }
        }
        for(int i = 0; i < n - 2;i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    if((arr[i] > arr[j])&& (arr[j] > arr[k])) ans++;
                }
            }
        }
        return ans;
    }
}