class Solution {
    public List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        
        for (char c = 'a'; c <= 'z'; c++){
            int minCount = Integer.MAX_VALUE;
            for (String s : A){
                int wordCount = 0;
                for (char cur_c : s.toCharArray()) if (cur_c == c) wordCount++;
                minCount = Math.min(minCount, wordCount);
            }
            
            for (int i = 0; i < minCount; i++) result.add("" + c);
        }
        
        return result;
}
    
    
}