class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans  = 0;
        for(String s : words){
            int flag = 1;
            for(int i = 0; i < s.length(); i++){
                if(!allowed.contains(String.valueOf(s.charAt(i)))){
                    flag++;
                    break;
                }
            }
           // System.out.println(s + " " + flag);
            if(flag == 1) ans++;
        }
        return ans;
    }
}