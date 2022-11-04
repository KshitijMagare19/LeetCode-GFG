class Solution {
    public String reverseVowels(String s) {
        String v = "";
        String r = "";
        String ans = "";
        String vv="aeiouAEIOU";
        for(int i = 0; i < s.length(); i++){
            if(vv.contains(Character.toString(s.charAt(i)))) v+=s.charAt(i);
        }
        for(int i = v.length()-1; i >=0 ; i--){
            r+=v.charAt(i);
        }
        int k = 0;
        for(int i = 0; i < s.length(); i++){
            if(vv.contains(Character.toString(s.charAt(i)))){
               ans+=r.charAt(k++); 
            } 
            else{
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}