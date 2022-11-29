class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        String s = "";
        for(int i = 0; i < n; i++){
            s+=words[i];
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char key = s.charAt(i);
            if(map.containsKey(key)){
                map.put(key,map.get(key) + 1);
            }
            else{
                map.put(key,1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            char key = s.charAt(i);
            if(map.get(key)%n != 0){
                return false;
            }
        }
        return true;   
    }
}