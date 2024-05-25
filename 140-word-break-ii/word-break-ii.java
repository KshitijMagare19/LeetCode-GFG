class Solution {
    Map<String, List<String>> map = new HashMap<>();
    
    public List<String> wordBreak(String s, List<String> wordDict) {
        if (map.containsKey(s)) return map.get(s);
        
        List<String> res = new ArrayList<>();
        
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                if (s.length() == word.length())
                    res.add(word);
                else {
                    List<String> sub = wordBreak(s.substring(word.length()), wordDict);
                    for (String w : sub)
                        res.add(word + " " + w);
                }
            }
        }
        
        map.put(s, res);
        return map.get(s);
    }
}