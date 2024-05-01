class Solution {
    public String reversePrefix(String word, char ch) {
        String ans = "";
        int index = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch){
                index = i;
                break;
            }
        }
        
        for(int i = index; i >= 0; i--){
            ans+=word.charAt(i);
        }
        for(int i = index + 1; i < word.length(); i++){
            ans+=word.charAt(i);
        }
        return ans;
    }
}