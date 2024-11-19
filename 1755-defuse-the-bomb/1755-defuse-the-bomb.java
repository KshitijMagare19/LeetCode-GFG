class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
    int arr[] = new int[n];
    int sum=0;
   // for(int i=0;i<n;i++){
        if(k>0){
             for(int i=0;i<n;i++){
            for(int j=i+1;j<k+i+1;j++){
                if(j<n){
            sum+=code[j];
                }
                else{
                    sum+=code[j-n];
                }
            }
            arr[i] = sum;
        sum = 0;    
        }
        }
        if(k==0){
             for(int i=0;i<n;i++){
            arr[i] = 0;
        }
        }
        if(k<0) {
             for(int i=0;i<n;i++){
            for(int l=i-1;l>i-1+k;l--){
                if(l<0){
                    sum+=code[l+n];
                }
                else{
                    sum+=code[l];
                }
            }
            arr[i] = sum;
            sum=0;
        }
    }
    return arr;    
    }
}