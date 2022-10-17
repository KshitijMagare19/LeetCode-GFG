class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        char a = 'a';
        for(int i = 0; i < 26; i++){
            map.put(a++,1);
        }
        for(int i = 0; i < sentence.length(); i++){
            map.put(sentence.charAt(i),map.get(sentence.charAt(i))+1);
        }
        if(map.containsValue(1)) return false;
        else return true;
        
    }
}