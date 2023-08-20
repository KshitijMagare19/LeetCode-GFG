class Solution {
    public boolean isAcronym(List<String> words, String s) {
       if(s.length() != words.size()) return false;
       int index = 0;
       for(String str : words){
           if(str.charAt(0) != s.charAt(index++)) return false;
       } 
       return true;
    }
}