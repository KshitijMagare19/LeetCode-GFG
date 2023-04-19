class Solution {
    public int[] diStringMatch(String s) {
        int high = s.length();
        int low = 0;
        int[] ans = new int[high+1];

        for(int i = 0; i < s.length(); i++){
            //System.out.println(low + " "+ high);
            if(s.charAt(i) == 'I') ans[i] = low++;
            else ans[i] = high--;
        }
        if(s.charAt(s.length()-1) == 'I'){
            ans[s.length()] = low++;
        }
        else{
            ans[s.length()] = high--;
        }
        return ans;
    }
}