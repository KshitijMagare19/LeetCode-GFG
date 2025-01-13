class Solution {
    public int minimumLength(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0) + 1);
            set.add(c);
        }
        int deleteCount = 0;
        for (int frequency : map.values()) {
            if (frequency % 2 == 1) {
                // If frequency is odd, delete all except one
                deleteCount += frequency - 1;
            } else {
                // If frequency is even, delete all except two
                deleteCount += frequency - 2;
            }
        }
        return s.length() - deleteCount;

    }
}