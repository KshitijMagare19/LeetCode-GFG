class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        int ans = 0;  
        for(String i : words1){
            if(map1.containsKey(i)) map1.put(i,map1.get(i) + 1);
            else map1.put(i,1);
        }
        for(String i : words2){
            if(map2.containsKey(i)) map2.put(i,map2.get(i) + 1);
            else map2.put(i,1);
        }
        for(String i : words2){
            if(map1.containsKey(i) && map1.get(i) == 1 && map2.get(i) == 1){
                ans++;
            }
        }
        return ans;
        
    }
}