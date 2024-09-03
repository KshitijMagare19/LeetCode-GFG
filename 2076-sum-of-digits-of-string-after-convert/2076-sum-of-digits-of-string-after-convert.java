class Solution {
    public int getLucky(String s, int k) {
        char a  = 'a';
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 1; i <= 26; i++){
            map.put(a++,i);
        }
// System.out.println(map);
        String num = "";

        for(int i = 0; i < s.length(); i++){
            num = num + ""+ map.get(s.charAt(i))+ "";
        }
        // System.out.println(num);
        while(k-->0){

            ans = 0;
            for(int i = 0; i < num.length(); i++){
                ans = ans + (num.charAt(i) - '0') ;
            }
            num = String.valueOf(ans);
        }
        return ans;

    }
}