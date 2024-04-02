class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverseMap = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if (map.containsKey(charS)) {
                if (map.get(charS) != charT) {
                  return false;
                }
            } else {
                if (reverseMap.containsKey(charT)) {
                    return false;
                }
                map.put(charS, charT);
                reverseMap.put(charT, charS);
            }
        }
        
        return true;
    }
}