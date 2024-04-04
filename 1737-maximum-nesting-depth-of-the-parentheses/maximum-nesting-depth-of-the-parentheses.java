class Solution {
    public int maxDepth(String s) {
        //String s1 = s.replaceAll("[^()]","");
        int ans = 0, temp = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '('){
                temp++;
                ans = Math.max(temp,ans);
            } 
            if(s.charAt(i) == ')') temp--;
        }
        return ans;
    }
}