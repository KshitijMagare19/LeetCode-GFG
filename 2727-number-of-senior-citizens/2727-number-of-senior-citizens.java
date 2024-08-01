class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(int i = 0; i < details.length; i++){
            int age = (details[i].charAt(11) - '0') * 10 + (details[i].charAt(12) - '0');
            if(age > 60) ans++;
        }
        return ans;
    }
}