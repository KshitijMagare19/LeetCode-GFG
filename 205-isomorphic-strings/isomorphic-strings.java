class Solution {
    public boolean isIsomorphic(String s, String t) {
     HashMap<Character,Character> map = new HashMap<>();
     HashMap<Character,Character> map1 = new HashMap<>();
     for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        char c1 = t.charAt(i);
        if(map.containsKey(c) && map.get(c) != t.charAt(i)) return false;
        else if(!map.containsKey(c)) map.put(c,t.charAt(i));

        if(map1.containsKey(c1) && map1.get(c1) != s.charAt(i)) return false;
        else if(!map1.containsKey(c1)) map1.put(c1,s.charAt(i));
     }
     String s2 = "";
     String s3 = "";
     for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        s2+= map.get(c);

        char c1 = t.charAt(i);
        s3+= map1.get(c1);
     }
     return s2.equals(t) && s3.equals(s);

    //  if(t.length() != s.length()) return false;
    //  HashMap<Character,Integer> map3 = new HashMap<>();
    //  HashMap<Character,Integer> map4 = new HashMap<>();
    //  for(int i = 0; i < s.length(); i++){
    //     char c1 = s.charAt(i);
    //     map3.put(c1,map3.getOrDefault(c1,0)+1);
    //     char c2 = t.charAt(i);
    //     map4.put(c2,map4.getOrDefault(c2,0)+1);
    //     if(map3.get(c1) != map4.get(c2)) return false;
    //  }
     
    // return true;

    }
}