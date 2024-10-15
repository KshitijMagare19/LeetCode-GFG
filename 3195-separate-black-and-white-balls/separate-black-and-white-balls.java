class Solution {
    public long minimumSteps(String s) {
        String[] arr = s.split("");
        int count = 0;
        long ans = 0;
       
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i].equals("1") ){              
                count++;
            }
            else{
                ans+= count;
            }
            
        }
        //System.out.println(Arrays.toString(arr));
        return ans;
    }
}