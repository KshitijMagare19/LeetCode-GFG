class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        
        String[] words1 = sentence1.split("\\s");
        String[] words2 = sentence2.split("\\s");
        
        return words1.length <= words2.length ? areSentencesSimilar(words1, words2) : areSentencesSimilar(words2, words1);
    }
    
    private boolean areSentencesSimilar(String[] words1, String[] words2){
        int matchCount = 0;
        
        int len1 = words1.length; // words of short sentence 
        int len2 = words2.length; // words of long sentence 
        
        int i = 0;
        //find numbers of word matching from starting
        while(i < len1 && words1[i].equals(words2[i])){
            i++;
            matchCount++;
        }
        
        //find numbers of word matching from end
        while(i < len1 && words1[i].equals(words2[len2 - (len1 - i)])){
            i++;
            matchCount++;
        }
        
        return matchCount == len1;
    }
 }