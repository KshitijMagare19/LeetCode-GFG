class Solution {
    public boolean isPrefixAndSuffix(String a , String b){
        if(a.length() > b.length())return false;
        if(b.startsWith(a) && b.endsWith(a)) return true;
        else return false;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for(int i = 0; i < words.length-1;i++){
            for(int j = i+1; j < words.length; j++){
                if(isPrefixAndSuffix(words[i],words[j])) ans++;
            }
        }
        return ans;
    }
}