class Solution {
    public int takeCharacters(String s, int k) {
        int[] arr=new int[3];
        // count all the frq of string
        for(char ch:s.toCharArray()) arr[ch-'a']++;
        
        // if total frq of any char is less than k return -1;
        if(arr[0]<k||arr[1]<k||arr[2]<k) return -1;
        int ans=arr[0]+arr[1]+arr[2];
        int st=0;
        
        for(char ch:s.toCharArray()){
            arr[ch-'a']--;
            
            // if any char length is less than k then increase start position
            if(arr[0]<k||arr[1]<k||arr[2]<k){
                //get the min ans
                ans=Math.min(arr[0]+arr[1]+arr[2]+1,ans);
                while(s.charAt(st)!=ch){
                    arr[s.charAt(st)-'a']++;
                    st++;
                }
                arr[ch-'a']++;
                st++;
            }
        }
        ans=Math.min(arr[0]+arr[1]+arr[2],ans);
                
        return ans;
    }
}